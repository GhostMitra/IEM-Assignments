% Question 16: Print a hollow diamond pattern using numbers.
N = input("Enter number of rows: ");
disp("PATTERN 16");
for i = N:-1:1
    for j = i-1:-1:1
        fprintf(" ");
    end
    for k = 5:-1:i
        fprintf("%d ", k);
    end
    for l = (i+1):5
        fprintf("%d ", l);
    end
    fprintf("\n");
end
for i = 1:N
    for j = 0:i-1
        fprintf(" ");
    end
    for k = 5:-1:(i+1)
        fprintf("%d ", k);
    end
    for l = (i+2):5
        fprintf("%d ", l);
    end
    fprintf("\n");
end
fprintf("\n");