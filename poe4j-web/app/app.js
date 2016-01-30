'use strict';

// Angular
var angular = require('angular');
require('angular-ui-router');
require('angular-animate');
require('angular-ui-bootstrap');
require('angular-smart-table');

// CSS
require('./app.css');
require('bootstrap/dist/css/bootstrap.css');

// Create the angular app
angular.module('application', ['ui.router', 'ngAnimate', 'ui.bootstrap', 'smart-table'])
    .config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise('/');
    })
    .run(function ($rootScope, $location, $window, $log) {
        $rootScope.$on('$viewContentLoaded', function () {
            if (!$window.ga) {
                $log.warn("Analytics not found");
                return;
            }

            $window.ga('send', 'pageview', {page: $location.path()});
        });
    });

// Require components
require('./home');
require('./chromatic-calculator');