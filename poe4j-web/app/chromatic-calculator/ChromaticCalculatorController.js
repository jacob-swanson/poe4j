'use strict';

var ChromaticCalculatorService = require('./ChromaticCalculator');

module.exports = function ($scope) {
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

    $scope.$watch('form', function (newValue) {
        if (newValue.numRedSockets + newValue.numBlueSockets + newValue.numGreenSockets > newValue.numSockets) {
            newValue.numSockets = newValue.numRedSockets + newValue.numBlueSockets + newValue.numGreenSockets;
        }

        $scope.rowCollection = ChromaticCalculatorService.doMath(newValue);
    }, true);
};