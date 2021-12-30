class TaxiFare:
    first_five_km = 5 * 20
    ten_km_after_first_five = 10 * 18

    # Fare Counter
    def get_fare(self, dist):
        if dist is None:
            return None;
        elif dist <= 0:
            return -1
        elif dist <= 2:
            return float(50)
        elif dist <= 5:
            return dist * 20
        elif dist <= 15:
            return self.first_five_km + (dist - 5) * 18
        return self.first_five_km + self.ten_km_after_first_five + (dist - 15) * 15