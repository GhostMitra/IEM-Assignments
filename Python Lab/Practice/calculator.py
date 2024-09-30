import math
flag = 1

while(flag == 1):
    print("Scientific calculator")
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")
    print("4. Division")
    print("5. Exponentiation")
    print("6. Logarithm")
    print("7. Square root")
    print("8. Sine")
    print("9. Cosine")
    print("10. Tangent")
    print("11. Cosecant")
    print("12. Secant")
    print("13. Cotangent")
    print("14. Exit")
    choice = int(input("Enter your choice: "))

    if choice == 1:
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))
        print("Result: ", num1 + num2)
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 2:
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))
        print("Result: ", num1 - num2)
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 3:
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))
        print("Result: ", num1 * num2)
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 4:
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))
        if num2 != 0:
            print("Result: ", num1 / num2)
        else:
            print("Error: Division by zero is not allowed.")
        
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 5:
        num1 = float(input("Enter base: "))
        num2 = float(input("Enter exponent: "))
        print("Result: ", num1 ** num2)
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 6:
        num = float(input("Enter number: "))
        print("Result: ", math.log(num))
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 7:
        num = float(input("Enter number: "))
        print("Result: ", math.sqrt(num))
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 8:
        num = float(input("Enter number in radians: "))
        print("Result: ", math.sin(num))
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 9:
        num = float(input("Enter number in radians: "))
        print("Result: ", math.cos(num))
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 10:
        num = float(input("Enter number in radians: "))
        print("Result: ", math.tan(num))
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 11:
        num = float(input("Enter number in radians: "))
        if math.sin(num) != 0:
            print("Result: ", 1 / math.sin(num))
        else:
            print("Error: Division by zero is not allowed.")
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 12:
        num = float(input("Enter number in radians: "))
        if math.cos(num) != 0:
            print("Result: ", 1 / math.cos(num))
        else:
            print("Error: Division by zero is not allowed.")
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 13:
        num = float(input("Enter number in radians: "))
        if math.tan(num) != 0:
            print("Result: ", 1 / math.tan(num))
        else:
            print("Error: Division by zero is not allowed.")
        flag = int(input("Wanna Continue: 1. Yes/ 2. No: "))
    elif choice == 14:
        print("Exiting the calculator.")
        flag = 2
    else:
        print("Invalid choice. Please choose a valid option.")
        flag = 1