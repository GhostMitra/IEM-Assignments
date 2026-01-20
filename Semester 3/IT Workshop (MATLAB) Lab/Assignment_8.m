% Given data points
x = [5, 6, 9, 11];
y = [12, 13, 14, 16];

% Interpolation calculation
n = length(x);
xfind = 10;
result = 0;

for i = 1:n
    term = y(i);
    for j = 1:n
        if j ~= i
            term = term * (xfind - x(j)) / (x(i) - x(j));
        end
    end
    result = result + term;
end

% Display the interpolated value
fprintf('The interpolated value at xfind = %.2f is %.2f\n', xfind, result);

% Create and display the interpolation table
T = table(x', y', 'VariableNames', {'x', 'y'});

% Add the interpolated value as a new variable with the same number of rows
T.InterpolatedValue = repmat(result, height(T), 1); % Repeat the result for each row

disp(T);
