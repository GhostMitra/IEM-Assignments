def palindrome(n):
    temp = n
    reverse = 0
    while temp>0:
        reverse = reverse*10 + temp%10
        temp //= 10
    return reverse == n

number = int(input("Enter a number: "))
if(palindrome(number)):
    print(f"{number} is a palindrome number")
else:
    print(f"{number} is not a palindrome number")
