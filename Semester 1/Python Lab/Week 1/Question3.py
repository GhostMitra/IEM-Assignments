## Write a Python program to print the series up to N terms: 1, 3, 7, 13, 21, 31,.... and count the number of mathematical operators used without using any functions.

n = int(input("Enter the number of terms: "))
series = [1]
operators = 0
for i in range(1, n):
    series.append(series[i-1] + 2 * i + 1)
    operators += 2
print("Series up to", n, "terms:", series)
print("Number of mathematical operators used:", operators)