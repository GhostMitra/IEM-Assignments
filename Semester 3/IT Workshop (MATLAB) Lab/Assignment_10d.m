% Question 4: Find and print all prime numbers in a given range.
low = input('Enter the starting number: ');
high = input('Enter the ending number: ');
fprintf('Prime numbers between %d and %d are: \n', low, high);
for n = low:high
    if isprime(n)
        fprintf('%d ', n);
    end
end
fprintf('\n');