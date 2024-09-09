def armstrong(n):
    temp = n
    sum_cube_of_digits = 0
    while temp>0:
        sum_cube_of_digits += (temp%10)**3
        temp //= 10
    return sum_cube_of_digits == n
    
number = int(input("Enter a number: "))
if(armstrong(number)):
    print(f"{number} is an armstrong number")
else:
    print(f"{number} is not an armstrong number")
