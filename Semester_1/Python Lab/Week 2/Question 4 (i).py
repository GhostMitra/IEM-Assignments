## Implement the following functions/methods which operates on list in Python with suitable examples: list()


def create_list():
    """Create a new empty list."""
    return list()

def main():
    user_input = input("Enter elements for the list (comma-separated): ")
    elements = user_input.split(',')
    user_list = list(elements)
    print("Created list:", user_list)

if __name__ == "__main__":
    main()