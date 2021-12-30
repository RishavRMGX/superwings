from math import ceil


class Median:

    def get_median(self, input_array, size):
        if input_array is None or size is None:
            return None
        else:
            input_array.sort()
            temp = size/2
            position = int(ceil(temp))
            return input_array[position - 1]
