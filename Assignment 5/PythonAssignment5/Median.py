from math import ceil


class Median:

    def get_median(self, input_array, size):
        if input_array is None or size is None:
            return None
        else:
            position = ceil(size / 2)
            return input_array[position-1]
