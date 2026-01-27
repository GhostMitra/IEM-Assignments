% Question 11: Print a right-angled triangle with repeating row numbers.
N = input("Enter number of rows: ");
disp("PATTERN 11");
for i = 1:N
    for j = 1:i
        fprintf("%d ", i);
    end
    fprintf("\n");
end
fprintf("\n");