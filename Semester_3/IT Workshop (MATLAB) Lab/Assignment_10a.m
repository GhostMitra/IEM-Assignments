% Question 1: Print a right-angled triangle of numbers.
N = input("Enter number of rows: ");
disp("PATTERN 1");
for i = 1:N
    for j = 1:i
        fprintf("%d ", j);
    end
    fprintf("\n");
end
fprintf("\n");