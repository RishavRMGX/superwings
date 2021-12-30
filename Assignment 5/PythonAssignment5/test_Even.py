from unittest import TestCase
from Even import Even


class TestEven(TestCase):
    even = Even()

    def test_check_even_with_None(self):
        self.assertEqual(self.even.check_even(None), None)

    def test_check_even_with_even(self):
        self.assertTrue(self.even.check_even(8))

    def test_check_even_with_odd(self):
        self.assertFalse(self.even.check_even(7))
