X = [50, 100, 150, 200, 250];
Y = [618, 724, 805, 906, 1032];
n = length(X);
diffTable = zeros(n, n);
diffTable(:, 1) = Y';
for j = 2:n
    for i = 1:n-j+1
        diffTable(i, j) = diffTable(i+1, j-1) - diffTable(i, j-1);
    end
end
disp('Backward Difference Table:');
disp(diffTable);
x0 = 300;
h = X(2) - X(1); 
p = (x0 - X(n)) / h; 
Y_n = diffTable(n, 1); 
for k = 1:n-1
    prodTerm = 1;
    for j = 0:k-1
        prodTerm = prodTerm * (p + j);
    end
    Y_n = Y_n + (prodTerm * diffTable(n-k, k+1)) / factorial(k);
end
fprintf('The interpolated value at Y(300) is: %.4f\n', Y_n);