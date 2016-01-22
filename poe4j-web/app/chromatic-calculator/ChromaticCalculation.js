'use strict';

module.exports = function (craftType, successChance, averageAttempts, costPerTry, averageCost, standardDeviation) {
    return {
        craftType: craftType.description || '',
        successChance: successChance || 0.0,
        averageAttempts: averageAttempts || 0,
        costPerTry: costPerTry || 0,
        averageCost: averageCost || 0,
        standardDeviation: standardDeviation || 0
    };
};
