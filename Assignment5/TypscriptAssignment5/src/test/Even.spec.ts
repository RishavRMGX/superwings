import {Even} from '../Even';
import {expect} from 'chai';

describe('even', () => {
    it('should return 0 for input as odd number',() => {
        let even = new Even();
        expect(even.evenNumberChecker(7)).to.equal(0);
    })
})

describe('even', () => {
    it('should return 1 for input as even number',() => {
        let even = new Even();
        expect(even.evenNumberChecker(16)).to.equal(1);
    })
})
