from unittest import TestCase
from LeapYear import LeapYear


class TestLeapYear(TestCase):
    leap_year = LeapYear()

    def test_check_leap_year_with_none(self):
        self.assertEqual(self.leap_year.check_leap_year(None), None)

    def test_check_leap_year_with_multiple_of4(self):
        self.assertTrue(self.leap_year.check_leap_year(16))

    def test_check_leap_year_with_multiple_of400(self):
        self.assertTrue(self.leap_year.check_leap_year(1600))

    def test_check_leap_year_with_multiple_of100_not_400(self):
        self.assertFalse(self.leap_year.check_leap_year(700))

    def test_check_leap_year_with_not_multiple_of4(self):
        self.assertFalse(self.leap_year.check_leap_year(27))
