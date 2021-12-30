from unittest import TestCase
from Median import Median


class TestMedian(TestCase):

    median = Median()

    def test_get_median_with_none(self):
        self.assertEqual(self.median.get_median(None, None), None)

    def test_get_median_with_sorted_array(self):
        self.assertEqual(self.median.get_median([1,2,3,4,5],5), 3)

    def test_get_median_with_unsorted_array(self):
        self.assertEqual(self.median.get_median([9,2,6,7,3],5), 6)
