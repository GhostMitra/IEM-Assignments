% Question 10: Print a pyramid pattern using asterisks.
N = input("Enter number of rows: ");
for i = 1:N
    for j = i:N-1
        fprintf(" ");
    end
    for k = 1:i
        fprintf("* ");
    end
    fprintf("\n");
end
fprintf("\n");