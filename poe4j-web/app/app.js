'use strict';

// Angular
var angular = require('angular');
var jquery = require('jquery');
require('angular-ui-router');
require('angular-animate');
require('angular-ui-bootstrap');
require('angular-smart-table');

// Material
require('imports?jQuery=jquery!bootstrap-material-design/dist/js/material.js');
require('imports?jQuery=jquery!bootstrap-material-design/dist/js/ripples.js');

// CSS
require('bootstrap/dist/css/bootstrap.css');
require('bootstrap-material-design/dist/css/bootstrap-material-design.css');
require('bootstrap-material-design/dist/css/ripples.css');
require('./app.css');


// Create the angular app
angular.module('application', ['ui.router', 'ngAnimate', 'ui.bootstrap', 'smart-table'])
    .config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise('/');
    })
    .run(function ($rootScope, $location, $window, $log) {
        jquery.material.init();

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