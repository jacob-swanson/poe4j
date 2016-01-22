'use strict';

var angular = require('angular');
var app = angular.module('application');

var chromeCalcTemplateUrl = require('./chromatic-calculator.html');

app.controller('ChromaticCalculatorController', require('./ChromaticCalculatorController.js'));
app.filter('percent', require('./PercentFilter'));

app.config(function ($stateProvider) {
    $stateProvider.state('chromatic-calculator', {
        url: '/chromatic-calculator',
        templateUrl: chromeCalcTemplateUrl,
        controller: 'ChromaticCalculatorController'
    });
});