% Question15: Validate if a string is a strong password.
q15 = "Matlab2025";
disp("String taken: " + q15);
if contains(q15, digitsPattern) && contains(q15, lettersPattern) && ~contains(q15, " ")
    disp("Strong Password");
else
    disp("Weak Password");
end