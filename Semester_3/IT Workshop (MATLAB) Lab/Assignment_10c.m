% Question 3: Print a diamond pattern using asterisks.
N = input("Enter number of rows: ");
disp("PATTERN 3");
for i = 1:N
    for j = 1:i
        fprintf("* ");
    end
    fprintf("\n");
end
for i = N-1:-1:1
    for j = i:-1:1
        fprintf("* ");
    end
    fprintf("\n");
end
fprintf("\n");