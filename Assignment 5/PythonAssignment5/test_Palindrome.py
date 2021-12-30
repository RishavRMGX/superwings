from unittest import TestCase
from Palindrome import Palindrome


class TestPalindrome(TestCase):
    palindrome = Palindrome()

    def test_check_palindrome_with_None(self):
        self.assertEqual(self.palindrome.check_palindrome(None), None)

    def test_check_palindrome_with_palindrome(self):
        self.assertTrue(self.palindrome.check_palindrome("madam"))

    def test_check_palindrome_with_non_palindrome(self):
        self.assertFalse(self.palindrome.check_palindrome("Racecar"))
