% Question 12: Print Floyd's Triangle (a right-angled triangle with consecutive numbers).
N = input("Enter number of rows: ");
disp("PATTERN 12");
k = 1;
for i = 1:N
    for j = 1:i
        fprintf("%d ", k);
        k = k + 1;
    end
    fprintf("\n");
end
fprintf("\n");