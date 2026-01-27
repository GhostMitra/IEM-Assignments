## Given a list of numbers return the indices in which a specific number occurs

def find_indices(lst, num):
    return [i for i, x in enumerate(lst) if x == num]

numbers = input("Enter a list of numbers separated by space: ")
target_number = int(input("Enter the number to find indices for: "))

numbers = list(map(int, numbers.split()))

print("The number", target_number, "occurs at indices: ", find_indices(numbers, target_number))