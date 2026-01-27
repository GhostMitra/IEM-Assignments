% Question6: Check if a string contains any digits.
q6 = "My roll number is 12345";
disp("String taken: " + q6);
if contains(q6, digitsPattern)
    disp("The string has digits");
else
    disp("The string does not have digits");
end
fprintf('\n');