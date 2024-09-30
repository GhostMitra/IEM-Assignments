## Take input from one file and place it to another file. Use ASCII value for comparison. Rotate the contetnt in the copied file. Design one hash function to check the integrity of the two files.
def rotate_content(content, rotation):
    return content[-rotation:] + content[:-rotation]

def hash_function(content):
    return sum(ord(char) for char in content)

def copy_and_rotate_file(input_filename, output_filename, rotation):
    try:
        with open(input_filename, 'r') as input_file:
            content = input_file.read()
            rotated_content = rotate_content(content, rotation)
            with open(output_filename, 'w') as output_file:
                output_file.write(rotated_content)
        return hash_function(content), hash_function(rotated_content)
    except FileNotFoundError:
        print("Input file not found.")
        return None

def main():
    input_filename = input("Enter the input filename: ")
    output_filename = input("Enter the output filename: ")
    rotation = int(input("Enter the rotation value: "))
    input_hash, output_hash = copy_and_rotate_file(input_filename, output_filename, rotation)
    if input_hash is not None:
        print(f"Input file hash: {input_hash}")
        print(f"Output file hash: {output_hash}")
        if input_hash == output_hash:
            print("Files are identical.")
        else:
            print("Files are not identical.")

if __name__ == "__main__":
    main()