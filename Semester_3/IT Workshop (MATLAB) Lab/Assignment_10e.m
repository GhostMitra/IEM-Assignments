% Question 5: Generate and print the Fibonacci series up to a specified number of terms.
n = 10;
f1 = 0;
f2 = 1;
fprintf('Fibonacci series up to %d terms:\n', n);
fprintf('%d %d ', f1, f2);
for i = 3:n
    f3 = f1 + f2;
    fprintf('%d ', f3);
    f1 = f2;
    f2 = f3;
end
fprintf('\n');