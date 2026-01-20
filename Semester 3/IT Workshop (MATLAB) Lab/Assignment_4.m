
x = [0.10, 0.15, 0.20, 0.25, 0.30];
y = [0.1003, 0.1511, .2027, .2553, .3093];
n = length(x);
F = zeros(n, n);
F(:, 1) = y'; 
for j = 2:n
    for i = 1:n-j+1
        F(i, j) = F(i+1, j-1) - F(i, j-1);
    end
end
disp('Forward Difference Table:');
disp(F);
x_inter = 0.12;
h = x(2) - x(1);
p = (x_inter - x(1)) / h;
result = F(1, 1); 
for j = 1:n-1
    term = F(1, j+1);
    for k = 0:j-1
        term = term * (p - k) / factorial(j);
    end
    result = result + term;
end
fprintf('x interpolated value at 0.12000 is %f\n', result);