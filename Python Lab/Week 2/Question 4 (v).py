## Implement the follwoing functions/menthods which operates on list in python with suitable examples: append()

def append_list_elements():
    user_list = input("Enter the list elements separated by space: ")
    user_list = user_list.split()
    element_to_append = input("Enter the element to append: ")
    user_list.append(element_to_append)
    print(f"The element '{element_to_append}' is appended in the list. The new list is : {user_list}")

append_list_elements()
