import unittest
from TaxiFare import TaxiFare


class Test(unittest.TestCase):
    taxi_fare = TaxiFare()

    def test_get_fare_distance_less_then2(self):
        self.assertEqual(TaxiFare.get_fare(None), None);

    def test_get_fare_distance_less_then0(self):
        self.assertEqual(TaxiFare.get_fare(self.taxi_fare, -5), -1);

    def test_get_fare_distance_less_then2(self):
        self.assertEqual(TaxiFare.get_fare(self.taxi_fare, 1), 50);

    def test_get_fare_distance_less_then5(self):
        self.assertEqual(TaxiFare.get_fare(self.taxi_fare, 3), 60);

    def test_get_fare_distance_less_then15(self):
        self.assertEqual(TaxiFare.get_fare(self.taxi_fare, 10), 190);

    def test_get_fare_distance_greater_then15(self):
        self.assertEqual(TaxiFare.get_fare(self.taxi_fare, 25), 430);


if __name__ == '__main__':
    unittest.main()
