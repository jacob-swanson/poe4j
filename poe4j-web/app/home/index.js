'use strict';

var angular = require('angular');
var homeTemplateUrl = require('./home.html');

angular.module('application')
    .config(function ($stateProvider) {
        $stateProvider.state('home', {
            url: '/',
            templateUrl: homeTemplateUrl
        });
    });