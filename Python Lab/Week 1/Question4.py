## Write a python program to input a number and check whether it is a krishnamurthy number or not, using functions and count the number of iterations used without any functions

def factorial(n):
    if n==0:
        return 1
    else:
        return n*factorial(n-1)

def krishnamurthy(n):
    temp = n;
    sum_of_factorial_digits = 0
    while temp>0:
        sum_of_factorial_digits += factorial(temp%10)
        temp = temp//10
    return n==sum_of_factorial_digits
    
number = int(input("Enter a number: "))
iteration_count = 0


temp = number

while temp>0:
    iteration_count += 1
    temp = temp//10

if(krishnamurthy(number)):
    print(f"{number} is a krishnamurthy number")
else:
    print(f"{number} is not a krishnamurthy number")
print(f"Iteration count: {iteration_count}")