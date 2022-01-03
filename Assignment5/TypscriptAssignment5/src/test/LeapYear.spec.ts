import {LeapYear} from '../LeapYear';
import {expect} from 'chai';

describe('leapYear', () => {
    it('should return true for input multiple of 4 but not 100',() => {
        let leapYear = new LeapYear();
        expect(leapYear.leapYearChecker(16)).to.equal(true);
    })
})

describe('leapYear', () => {
    it('should return false for input non multiple of 4',() => {
        let leapYear = new LeapYear();
        expect(leapYear.leapYearChecker(13)).to.equal(false);
    })
})

describe('leapYear', () => {
    it('should return true for input multiple of 4, 100 and 400',() => {
        let leapYear = new LeapYear();
        expect(leapYear.leapYearChecker(1600)).to.equal(true);
    })
})

describe('leapYear', () => {
    it('should return false for input multiple of 4 and 100 but not 400',() => {
        let leapYear = new LeapYear();
        expect(leapYear.leapYearChecker(1300)).to.equal(false);
    })
})
