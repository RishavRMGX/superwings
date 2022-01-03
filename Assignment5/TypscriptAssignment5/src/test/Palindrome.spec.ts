import {Palindrome} from '../Palindrome';
import {expect} from 'chai';

describe('median', () => {
    it('Should return true for madam is palindrome',() => {
        let palindrome = new Palindrome();
        expect(palindrome.palindromeChecker("madam")).to.equal(true);
    })
})

describe('median', () => {
    it('Should return false for Racecar is palindrome',() => {
        let palindrome = new Palindrome();
        expect(palindrome.palindromeChecker("Racecar")).to.equal(false);
    })
})
