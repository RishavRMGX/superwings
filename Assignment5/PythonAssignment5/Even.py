class Even:

    def check_even(self, num):
        if num is None:
            return None
        elif num%2==0:
            return True
        else:
            return False