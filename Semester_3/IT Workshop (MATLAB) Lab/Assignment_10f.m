% Question 6: Calculate and display the cube of numbers up to a given integer.
num = input('Enter a number: ');
fprintf('Cubes of numbers from 1 to %d:\n', num);
for i = 1:num
    fprintf('%d^3 = %d\n', i, i^3);
end