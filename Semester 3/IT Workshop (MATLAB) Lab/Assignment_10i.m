% Question 9: Calculate the sum of the series 2 + 22 + 222 + ...
n = input('Enter number of terms: ');
term = 0;
sumSeries = 0;
for i = 1:n
    term = term * 10 + 2; % builds 2, 22, 222...
    sumSeries = sumSeries + term;
end
fprintf('Sum of series up to %d terms = %d\n', n, sumSeries);