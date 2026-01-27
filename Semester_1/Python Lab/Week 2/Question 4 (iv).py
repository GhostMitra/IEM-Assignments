## Implement the follwoing functions/menthods which operates on list in python with suitable examples: index()

def index_list_elements():
    user_list = input("Enter the list elements separated by space: ")
    user_list = user_list.split()
    element_to_search = input("Enter the element to search: ")
    index = user_list.index(element_to_search)
    print(f"The element '{element_to_search}' is in index {index} in the list.")

index_list_elements()
