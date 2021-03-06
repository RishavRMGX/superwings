import {TaxiFare} from '../src/TaxiFare'
import {expect} from 'chai'

describe('taxifare', () => {
    it('should return -1 for negative input as a distance',() => {
        let taxiFare = new TaxiFare();
        expect(taxiFare.getFare(-10)).to.equal(-1);
    })
})

describe('taxifare', () => {
    it('should return 50Rs for distance less than 2',() => {
        let taxiFare = new TaxiFare();
        expect(taxiFare.getFare(1)).to.equal(50);
    })
})

describe('taxifare', () => {
    it('should return 80Rs for distance less than 5 (distance=4)',() => {
        let taxiFare = new TaxiFare();
        expect(taxiFare.getFare(4)).to.equal(4*20);
    })
})

describe('taxifare', () => {
    it('should return 154Rs for distance less than 15 (distance=4)',() => {
        let taxiFare = new TaxiFare();
        expect(taxiFare.getFare(8)).to.equal((5*20)+((8-5)*18));
    })
})

describe('taxifare', () => {
    it('should return 430Rs for distance greater than 15 (distance=25)',() => {
        let taxiFare = new TaxiFare();
        expect(taxiFare.getFare(25)).to.equal((5*20)+(10*18)+((25-15)*15));
    })
})