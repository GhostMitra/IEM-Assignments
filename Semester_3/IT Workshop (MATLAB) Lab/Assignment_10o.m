% Question 15: Print a diamond shape using a number pyramid pattern.
N = input("Enter number of rows: ");
disp("PATTERN 15");
for i = 1:N
    for j = 1:(N-i)
        fprintf(" ");
    end
    for k = 1:i
        fprintf("%d ", k);
    end
    for l = (i-1):-1:1
        fprintf("%d ", l);
    end
    fprintf("\n");
end
for i = (N-1):-1:1
    for j = 1:(N-i)
        fprintf(" ");
    end
    for k = 1:i
        fprintf("%d ", k);
    end
    for l = (i-1):-1:1
        fprintf("%d ", l);
    end
    fprintf("\n");
end
fprintf("\n");