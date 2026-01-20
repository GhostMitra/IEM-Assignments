% Question 14: Print an inverted pattern with mirrored, decreasing and increasing numbers.
N = input("Enter number of rows: ");
disp("PATTERN 14");
for i = N:-1:1
    for j = i:-1:1
        fprintf("%d", j);
    end
    for k = 1:2*(N-i)
        fprintf(" ");
    end
    fprintf(" ");
    for k = 1:i
        fprintf("%d", k);
    end
    fprintf("\n");
end
fprintf("\n");