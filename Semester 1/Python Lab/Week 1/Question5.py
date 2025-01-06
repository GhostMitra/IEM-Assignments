## Write a Python program to create a list of 20 values and find out Mean, Median and Mode of list of numbers. Count the number of seperators used.

import random

def calculate_mean(num_list):
    return sum(num_list) / len(num_list)

def calculate_median(num_list):
    num_list.sort()
    n = len(num_list)
    if n % 2 == 0:
        median = (num_list[n//2 - 1] + num_list[n//2]) / 2
    else:
        median = num_list[n//2]
    return median

def calculate_mode(num_list):
    frequency_dict = {}
    for num in num_list:
        if num in frequency_dict:
            frequency_dict[num] += 1
        else:
            frequency_dict[num] = 1
    max_frequency = max(frequency_dict.values())
    modes = [num for num, freq in frequency_dict.items() if freq == max_frequency]
    return modes

def count_separators(input_str):
    return input_str.count(',')

input_str = input("Enter a list of 20 numbers separated by comma: ")
num_list = [int(num) for num in input_str.split(',')]
if len(num_list) != 20:
    print("Invalid input. Please enter 20 numbers.")
mean = calculate_mean(num_list)
median = calculate_median(num_list)
mode = calculate_mode(num_list)
separators = count_separators(input_str)
print("Mean: ", mean)
print("Median: ", median)
print("Mode: ", mode)
print("Number of separators: ", separators)