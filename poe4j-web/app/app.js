'use strict';

var angular = require('angular');
require('angular-ui-router');
require('angular-animate');
require('bootstrap/dist/css/bootstrap.css');
require('jquery');
require('./app.css');

var homeTemplateUrl = require('./templates/home.html');
var chromeCalcTemplateUrl = require('./templates/chromatic-calculator.html');

angular.module('application', [
        'ui.router',
        'ngAnimate'
]).config(config) ;

function config($stateProvider, $urlRouterProvider) {

    $stateProvider.state('home', {
        url: '/',
        templateUrl: homeTemplateUrl
    }).state('chromatic-calculator', {
        url: '/chromatic-calculator',
        templateUrl: chromeCalcTemplateUrl,
        controller: 'ChromaticCalculatorController'
    });

    $urlRouterProvider.otherwise('/');
}

angular.module('application').filter('percent', ['$filter', function ($filter) {
    return function (input, decimals) {
        return $filter('number')(input * 100, decimals) + '%';
    };
}]);

var ChromaticCalculation = function (craftType, successChance, averageAttempts, costPerTry, averageCost, standardDeviation) {
    return {
        craftType: craftType.description || '',
        successChance: successChance || 0.0,
        averageAttempts: averageAttempts || 0,
        costPerTry: costPerTry || 0,
        averageCost: averageCost || 0,
        standardDeviation: standardDeviation || 0
    };
};

var CraftType = function (description, redSockets, greenSockets, blueSockets, costPerTry, chromaticBonus) {
    return {
        description: description || '',
        redSockets: redSockets || 0,
        greenSockets: greenSockets || 0,
        blueSockets: blueSockets || 0,
        costPerTry: costPerTry || 0,
        chromaticBonus: chromaticBonus || false
    };
};

angular.module('application').controller('ChromaticCalculatorController', function ($scope) {
    var craftTypes = [];
    craftTypes.push(new CraftType("Chromatic", 0, 0, 0, 1, true));
    craftTypes.push(new CraftType("1R", 1, 0, 0, 4));
    craftTypes.push(new CraftType("2R", 2, 0, 0, 25));
    craftTypes.push(new CraftType("3R", 3, 0, 0, 285));
    craftTypes.push(new CraftType("1G", 0, 1, 0, 4));
    craftTypes.push(new CraftType("2G", 0, 2, 0, 25));
    craftTypes.push(new CraftType("3G", 0, 3, 0, 285));
    craftTypes.push(new CraftType("1B", 0, 0, 1, 4));
    craftTypes.push(new CraftType("2B", 0, 0, 2, 25));
    craftTypes.push(new CraftType("3B", 0, 0, 3, 285));
    craftTypes.push(new CraftType("1R1G", 1, 1, 0, 15));
    craftTypes.push(new CraftType("1R1B", 1, 0, 1, 15));
    craftTypes.push(new CraftType("1G1B", 0, 1, 1, 15));
    craftTypes.push(new CraftType("2B1R", 1, 0, 2, 100));
    craftTypes.push(new CraftType("2B1G", 0, 1, 2, 100));
    craftTypes.push(new CraftType("2R1G", 2, 1, 0, 100));
    craftTypes.push(new CraftType("2R1B", 2, 0, 1, 100));
    craftTypes.push(new CraftType("2G1B", 0, 2, 1, 100));
    craftTypes.push(new CraftType("2G1R", 1, 2, 0, 100));

    var redProbability = 0.0;
    var greenProbability = 0.0;
    var blueProbability = 0.0;

    $scope.form = {
        numSockets: 1,
        requiredStrength: 0,
        requiredDexterity: 0,
        requiredIntelligence: 0,
        numRedSockets: 0,
        numGreenSockets: 0,
        numBlueSockets: 0
    };

    $scope.rowCollection = [];

    /**
     * Calculate the factorial of a number.
     *
     * @param num Input number
     * @returns {Number} Factorial
     */
    function factorial(num) {
        var rVal = 1;
        for (var i = 2; i <= num; i++) {
            rVal *= i;
        }

        return rVal;
    }

    /**
     * Calculate the probability of a configuration of sockets.
     *
     * @param numRed Number of red sockets desired
     * @param numGreen Number of green sockets desired
     * @param numBlue Number of blue sockets desired
     * @param numFreeSockets Number of sockets that can be anything
     * @param position (Optional)
     * @returns {Number} Probability of configuration occurring
     */
    function calcConfigProbability(numRed, numGreen, numBlue, numFreeSockets, position) {
        if (position === undefined) {
            position = 1;
        }

        if (numFreeSockets > 0) {
            return (position <= 1 ? calcConfigProbability(numRed + 1, numGreen, numBlue, numFreeSockets - 1, 1) : 0) + // Red
                (position <= 2 ? calcConfigProbability(numRed, numGreen + 1, numBlue, numFreeSockets - 1, 2) : 0) + // Green
                calcConfigProbability(numRed, numGreen, numBlue + 1, numFreeSockets - 1, 3); // Blue
        } else {
            // (n! / (k1!k2!...km!)) * chance
            return (factorial(numRed + numGreen + numBlue) / (factorial(numRed) * factorial(numGreen) * factorial(numBlue))) * Math.pow(redProbability, numRed) * Math.pow(greenProbability, numGreen) * Math.pow(blueProbability, numBlue);
        }
    }

    /**
     * Calculate the bonus probability from using a chromatic orb. Chromatic orbs cannot roll as the previous thing.
     *
     * @param numFreeSockets Number of sockets that can be any color
     * @param numDesiredRed Number of red sockets desired
     * @param numDesiredGreen Number of green sockets desired
     * @param numDesiredBlue Number of blue sockets desired
     * @param numRed (Optional)
     * @param numGreen (Optional)
     * @param numBlue (Optional)
     * @param position (Optional)
     * @returns {Number} Bonus probability
     */
    function calcChromaticProbabilityBonus(numFreeSockets, numDesiredRed, numDesiredGreen, numDesiredBlue, numRed, numGreen, numBlue, position) {
        numRed = numRed || 0;
        numGreen = numGreen || 0;
        numBlue = numBlue || 0;
        if (position === undefined) {
            position = 1;
        }

        if (numRed >= numDesiredRed && numGreen >= numDesiredGreen && numBlue >= numDesiredBlue) {
            return 0;
        } else if (numFreeSockets > 0) {
            return (position <= 1 ? calcChromaticProbabilityBonus(numFreeSockets - 1, numDesiredRed, numDesiredGreen, numDesiredBlue, numRed + 1, numGreen, numBlue, 1) : 0) + // Red
                (position <= 2 ? calcChromaticProbabilityBonus(numFreeSockets - 1, numDesiredRed, numDesiredGreen, numDesiredBlue, numRed, numGreen + 1, numBlue, 2) : 0) + // Green
                calcChromaticProbabilityBonus(numFreeSockets - 1, numDesiredRed, numDesiredGreen, numDesiredBlue, numRed, numGreen, numBlue + 1, 3); // Blue
        } else {
            return (factorial(numRed + numGreen + numBlue) / (factorial(numRed) * factorial(numGreen) * factorial(numBlue))) * Math.pow(redProbability, numRed * 2.0) * Math.pow(greenProbability, numGreen * 2.0) * Math.pow(blueProbability, numBlue * 2.0);
        }
    }

    var X = 22.0;
    $scope.$watch('form', function () {
        $scope.rowCollection.length = 0;

        craftTypes.forEach(function (craftType) {
            // Filter out crafts that aren't valid
            if (craftType.redSockets > $scope.form.numRedSockets || craftType.greenSockets > $scope.form.numGreenSockets || craftType.blueSockets > $scope.form.numBlueSockets) {
                return;
            }

            // Number of sockets that need to be rolled
            var numRed = $scope.form.numRedSockets - craftType.redSockets;
            var numGreen = $scope.form.numGreenSockets - craftType.greenSockets;
            var numBlue = $scope.form.numBlueSockets - craftType.blueSockets;

            // chance = (STAT + X) / (STR + DEX + INT + 3X)
            // Divisor for calculating probability
            var divisor = $scope.form.requiredStrength + $scope.form.requiredDexterity + $scope.form.requiredIntelligence + 3 * X;

            // Individual color probabilities
            redProbability = (X + $scope.form.requiredStrength) / divisor;
            greenProbability = (X + $scope.form.requiredDexterity) / divisor;
            blueProbability = (X + $scope.form.requiredIntelligence) / divisor;

            // Number of sockets that can be random
            var freeSockets = $scope.form.numSockets - craftType.redSockets - craftType.greenSockets - craftType.blueSockets;

            // Calculate probability of configuration
            var totalProbability = calcConfigProbability(numRed, numGreen, numBlue, freeSockets - numRed - numGreen - numBlue);

            // Remove probability bonus from chromatics not being able to roll the same thing again
            if (craftType.chromaticBonus) {
                totalProbability /= 1 - calcChromaticProbabilityBonus(freeSockets, numRed, numGreen, numBlue);
            }

            // Add the results
            $scope.rowCollection.push(new ChromaticCalculation(
                craftType, // Type of craft
                totalProbability, // Probability
                1.0 / totalProbability, // Average attempts
                craftType.costPerTry, // Cost
                craftType.costPerTry / totalProbability, // Average cost
                Math.sqrt((1.0 - totalProbability) / (totalProbability * totalProbability)) // Standard deviation
            ));
        });
    }, true);
});