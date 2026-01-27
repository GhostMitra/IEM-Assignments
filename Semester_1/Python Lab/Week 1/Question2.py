## Write a Python program to create a Fibonacci sequence till a specific no of terms and count the number of variables used without any functions

n = int(input("Enter the number of terms: "))
a, b = 0, 1
count = 0
for i in range(n):
    print(a, end=" ")
    a = b
    b = a + b
    count += 1
print("\nNumber of variables used:", 3)