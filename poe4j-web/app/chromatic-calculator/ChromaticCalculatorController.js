'use strict';

var ChromaticCalculatorService = require('./ChromaticCalculator');
var itemData = require('./item-data.json');
var angular = require('angular');

var DEFAULT_FORM = {
    numSockets: 0,
    requiredStrength: 0,
    requiredDexterity: 0,
    requiredIntelligence: 0,
    numRedSockets: 0,
    numGreenSockets: 0,
    numBlueSockets: 0
};

module.exports = function ($scope) {
    $scope.form = angular.copy(DEFAULT_FORM);

    $scope.rowCollection = [];
    $scope.displayedCollection = [].concat($scope.rowCollection);

    $scope.onBaseItemSelect = function ($item) {
        if (!$scope.form.numSockets) {
            $scope.form.numSockets = $item.maxSockets;
        }

        $scope.form.requiredStrength = $item.str;
        $scope.form.requiredDexterity = $item.dex;
        $scope.form.requiredIntelligence = $item.int;

        $scope.selectedItem = $item;
    };

    $scope.itemArray = itemData;
    $scope.selectedItem= $scope.itemArray[Math.floor(Math.random() * itemData.length)];
    $scope.onBaseItemSelect($scope.selectedItem);

    $scope.reset = function() {
        $scope.form = angular.copy(DEFAULT_FORM);
        $scope.selectedItem = undefined;
    };

    $scope.$watch('form', function (newValue) {
        if (newValue.numRedSockets + newValue.numBlueSockets + newValue.numGreenSockets > newValue.numSockets) {
            newValue.numSockets = newValue.numRedSockets + newValue.numBlueSockets + newValue.numGreenSockets;
        }

        if ($scope.selectedItem &&
            ( $scope.selectedItem.str !== newValue.requiredStrength ||
            $scope.selectedItem.dex !== newValue.requiredDexterity ||
            $scope.selectedItem.int !== newValue.requiredIntelligence)) {
            $scope.selectedItem = undefined;
        }

        $scope.rowCollection = ChromaticCalculatorService.doMath(newValue);
    }, true);
};