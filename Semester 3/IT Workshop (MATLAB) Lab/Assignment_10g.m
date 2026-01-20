% Question 7: Reverse the digits of an integer.
num = 76542;
revNum = str2double(fliplr(num2str(num)));
fprintf('Original number: %d\n', num);
fprintf('Reversed number: %d\n', revNum);