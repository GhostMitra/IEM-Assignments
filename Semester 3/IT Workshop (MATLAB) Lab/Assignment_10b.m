% Question 2: Print an inverted right-angled triangle of numbers.
N = input("Enter number of rows: ");
disp("PATTERN 2");
for i = N:-1:1
    for j = i:-1:1
        fprintf("%d ", j);
    end
    fprintf("\n");
end
fprintf("\n");