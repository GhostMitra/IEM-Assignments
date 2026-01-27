## Write a python program to demonstrate the use of local and global variables

x = 50  # global variable

def func():
    x = 20  # local variable
    print("Local variable x:", x)

def func2():
    global x  # use global variable
    x = 30
    print("Global variable x:", x)

print("Global variable x before func2:", x)
func()
func2()
print("Global variable x after func2:", x)

x = int(input("Enter a value for global variable x: "))
print("Global variable x after user input:", x)