## Write a program in python to print all prime numbers inside a range of numbers provided by the user

def is_prime(n):
    """Check if a number is a prime number."""
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

def print_primes_in_range(start, end):
    """Print all prime numbers in a given range."""
    for num in range(start, end + 1):
        if is_prime(num):
            print(num, end=' ')
    print()  # For newline after printing all primes

# Main program
def main():
    try:
        start = int(input("Enter the start of the range: "))
        end = int(input("Enter the end of the range: "))

        if start > end:
            print("The start of the range must be less than or equal to the end.")
        else:
            print(f"Prime numbers between {start} and {end}:")
            print_primes_in_range(start, end)
    except ValueError:
        print("Please enter valid integer numbers.")

if __name__ == "__main__":
    main()
