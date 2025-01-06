## Implement the follwoing functions/menthods which operates on list in python with suitable examples: count()

def count_list_elements():
    user_list = input("Enter the list elements separated by space: ")
    user_list = user_list.split()
    element_to_count = input("Enter the element to count: ")
    count = user_list.count(element_to_count)
    print(f"The element '{element_to_count}' appears {count} times in the list.")

count_list_elements()
