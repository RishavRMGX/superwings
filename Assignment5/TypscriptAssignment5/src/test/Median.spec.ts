import {Median} from '../Median';
import {expect} from 'chai';

describe('median', () => {
    it('Should return median 3 for sorted array',() => {
        let median = new Median();
        expect(median.medianFinder([1,2,3,4,5])).to.equal(3);
    })
})

describe('leapYear', () => {
    it('should return median 12 for unsorted array',() => {
        let median = new Median();
        expect(median.medianFinder([12,16,5,8,14])).to.equal(12);
    })
})
