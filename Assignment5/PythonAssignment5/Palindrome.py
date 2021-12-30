class Palindrome:

    def check_palindrome(self, input):
        if input is None:
            return None
        else:
            rev_input = input[::-1]
            if input == rev_input:
                return True
        return False
