"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var TaxiFare_1 = require("../TaxiFare");
var chai_1 = require("chai");
describe('taxifare', function () {
    it('should return -1 for null input as a distance', function () {
        var taxiFare = new TaxiFare_1.TaxiFare();
        (0, chai_1.expect)(taxiFare.getFare(null)).to.equal(-1);
    });
});
describe('taxifare', function () {
    it('should return -1 for negative input as a distance', function () {
        var taxiFare = new TaxiFare_1.TaxiFare();
        (0, chai_1.expect)(taxiFare.getFare(null)).to.equal(-1);
    });
});
describe('taxifare', function () {
    it('should return 50Rs for distance less than 2', function () {
        var taxiFare = new TaxiFare_1.TaxiFare();
        (0, chai_1.expect)(taxiFare.getFare(1)).to.equal(50);
    });
});
describe('taxifare', function () {
    it('should return 80Rs for distance less than 5 (distance=4)', function () {
        var taxiFare = new TaxiFare_1.TaxiFare();
        (0, chai_1.expect)(taxiFare.getFare(4)).to.equal(4 * 20);
    });
});
describe('taxifare', function () {
    it('should return 154Rs for distance less than 15 (distance=4)', function () {
        var taxiFare = new TaxiFare_1.TaxiFare();
        (0, chai_1.expect)(taxiFare.getFare(8)).to.equal((5 * 20) + ((8 - 5) * 18));
    });
});
describe('taxifare', function () {
    it('should return 430Rs for distance greater than 15 (distance=25)', function () {
        var taxiFare = new TaxiFare_1.TaxiFare();
        (0, chai_1.expect)(taxiFare.getFare(25)).to.equal((5 * 20) + (10 * 18) + ((25 - 15) * 15));
    });
});
