'use strict';

module.exports = function (description, redSockets, greenSockets, blueSockets, costPerTry, chromaticBonus) {
    return {
        description: description || '',
        redSockets: redSockets || 0,
        greenSockets: greenSockets || 0,
        blueSockets: blueSockets || 0,
        costPerTry: costPerTry || 0,
        chromaticBonus: chromaticBonus || false
    };
};