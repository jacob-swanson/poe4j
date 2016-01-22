'use strict';

var CraftType = require('./CraftType');
var ChromaticCalculation = require('./ChromaticCalculation');

var craftTypes = [
    CraftType("Chromatic", 0, 0, 0, 1, true),
    CraftType("1R", 1, 0, 0, 4),
    CraftType("2R", 2, 0, 0, 25),
    CraftType("3R", 3, 0, 0, 285),
    CraftType("1G", 0, 1, 0, 4),
    CraftType("2G", 0, 2, 0, 25),
    CraftType("3G", 0, 3, 0, 285),
    CraftType("1B", 0, 0, 1, 4),
    CraftType("2B", 0, 0, 2, 25),
    CraftType("3B", 0, 0, 3, 285),
    CraftType("1R1G", 1, 1, 0, 15),
    CraftType("1R1B", 1, 0, 1, 15),
    CraftType("1G1B", 0, 1, 1, 15),
    CraftType("2B1R", 1, 0, 2, 100),
    CraftType("2B1G", 0, 1, 2, 100),
    CraftType("2R1G", 2, 1, 0, 100),
    CraftType("2R1B", 2, 0, 1, 100),
    CraftType("2G1B", 0, 2, 1, 100),
    CraftType("2G1R", 1, 2, 0, 100)
];

var redProbability = 0.0;
var greenProbability = 0.0;
var blueProbability = 0.0;

var X = 22.0;

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

function doMath(input) {
    var results = [];
    craftTypes.forEach(function (craftType) {

        // Filter out crafts that aren't valid
        if (craftType.redSockets > input.numRedSockets || craftType.greenSockets > input.numGreenSockets || craftType.blueSockets > input.numBlueSockets) {
            return;
        }

        // Number of sockets that need to be rolled
        var numRed = input.numRedSockets - craftType.redSockets;
        var numGreen = input.numGreenSockets - craftType.greenSockets;
        var numBlue = input.numBlueSockets - craftType.blueSockets;

        // chance = (STAT + X) / (STR + DEX + INT + 3X)
        // Divisor for calculating probability
        var divisor = input.requiredStrength + input.requiredDexterity + input.requiredIntelligence + 3 * X;

        // Individual color probabilities
        redProbability = (X + input.requiredStrength) / divisor;
        greenProbability = (X + input.requiredDexterity) / divisor;
        blueProbability = (X + input.requiredIntelligence) / divisor;

        // Number of sockets that can be random
        var freeSockets = input.numSockets - craftType.redSockets - craftType.greenSockets - craftType.blueSockets;

        // Calculate probability of configuration
        var totalProbability = calcConfigProbability(numRed, numGreen, numBlue, freeSockets - numRed - numGreen - numBlue);

        // Remove probability bonus from chromatics not being able to roll the same thing again
        if (craftType.chromaticBonus) {
            totalProbability /= 1 - calcChromaticProbabilityBonus(freeSockets, numRed, numGreen, numBlue);
        }

        // Add the results
        results.push(new ChromaticCalculation(
            craftType, // Type of craft
            totalProbability, // Probability
            1.0 / totalProbability, // Average attempts
            craftType.costPerTry, // Cost
            craftType.costPerTry / totalProbability, // Average cost
            Math.sqrt((1.0 - totalProbability) / (totalProbability * totalProbability)) // Standard deviation
        ));
    });
    return results;
}

module.exports = {
    doMath: doMath
};