import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class HomeTest {

    //  To Test Even Number Checker
    EvenChecker evenChecker = new EvenChecker();
    @Test
    public void checkWithInputNullForEvenNumberChecker(){
        Assertions.assertEquals(evenChecker.checkEvenNumber(null), null);
    }

    @Test
    public void checkWithInputEvenNumberForEvenNumberChecker(){
        Assertions.assertTrue(evenChecker.checkEvenNumber(10));
    }

    @Test
    public void checkWithInputOddNumberForEvenNumberChecker(){
        Assertions.assertFalse(evenChecker.checkEvenNumber(9));
    }

    //  To Test Leap Year Checker
    LeapYearChecker leapYearChecker = new LeapYearChecker();
    @Test
    public void checkWithInputNullForLeapYearChecker(){
        Assertions.assertEquals(leapYearChecker.checkLeapYear(null), null);
    }

    @Test
    public void checkForLeapYearWithMultipleOf4(){
        Assertions.assertTrue(leapYearChecker.checkLeapYear(40));
    }

    @Test
    public void checkForLeapYearWithoutMultipleOf4(){
        Assertions.assertFalse(leapYearChecker.checkLeapYear(42));
    }

    @Test
    public void checkForLeapYearWithMultipleOf100(){
        Assertions.assertFalse(leapYearChecker.checkLeapYear(200));
    }

    @Test
    public void checkForLeapYearWithMultipleOf400(){
        Assertions.assertTrue(leapYearChecker.checkLeapYear(1600));
    }

    //  To Test Median Finder
    MedianFinder median = new MedianFinder();

    @Test
    public void checkWithInputNullForMedianFinder(){
        Assertions.assertEquals(median.medianFinder(null,null), null);
    }

    @Test
    public void checkWithUnsortedArrayForMedianFinder(){
        Float[] arrayInput = {4.0f, 9.5f, 3.2f, 8.7f, 6.4f};
        Float output = 6.4f;
        Assertions.assertEquals(median.medianFinder(arrayInput,arrayInput.length),output);
    }

    //  To Test Palindrome Checker
    Palindrome palindrome = new Palindrome();
    @Test
    public void checkWithInputNullForPalindromeFinder(){
        Assertions.assertEquals(palindrome.palindromeChecker(null), null);
    }

    @Test
    public void checkWithPalindromeInputForPalindromeFinder(){
        Integer[] arrayInput = {4, 9, 3, 8, 6};
        Integer output = 6;
        Assertions.assertTrue(palindrome.palindromeChecker("madam"));

    }

    @Test
    public void checkWithNonPalindromeInputForPalindromeFinder(){
        Integer[] arrayInput = {4, 9, 3, 8, 6};
        Integer output = 6;
        Assertions.assertFalse(palindrome.palindromeChecker(" Racecar"));
    }
}