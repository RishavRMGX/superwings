class LeapYear:

    def check_leap_year(self, year):
        if year is None:
            return None
        elif year%4==0:
            if year%100==0:
                if year%400==0:
                    return True
                return  False
            return True
        return False