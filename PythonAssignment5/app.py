from Even import Even
from LeapYear import LeapYear
from Median import Median
from Palindrome import Palindrome

even = Even()
num: int = int(input("Please enter number to check if it's even"))
total = even.check_even(num)

if total is None:
    print("Invalid Number")
elif total:
    print(str(num)+" is Even")
else:
    print(str(num)+" is Odd")

leap_year = LeapYear()
year = int(input("Please enter Year to check if it's Leap Year"))
leap_year_result = leap_year.check_leap_year(year)

if leap_year_result is None:
    print("Invalid Year")
elif leap_year_result:
    print(str(year)+" is Leap Year")
else:
    print(str(year)+" is not Leap Year")

median = Median()
arr = input("Please enter array to get its median")
array_input = list(map(int,arr.split(' ')))
median_result = median.get_median(array_input, len(array_input))
if median_result is None:
    print("Invalid Array")
else:
    print(str(median_result)+" is median of "+ str(array_input))

palindrome = Palindrome()
input_string = input("Please enter String to check if it's Palindrome")
palindrome_result = palindrome.check_palindrome(input_string)

if palindrome_result is None:
    print("Invalid String")
elif palindrome_result:
    print(input_string +" is Palindrome")
else:
    print(input_string + " is not Palindrome")