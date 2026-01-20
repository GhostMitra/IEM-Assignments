% Question11: Check for a substring, ignoring case.
q11 = "I am learning python programming";
disp("String taken: " + q11);
if contains(q11, "PYTHON", 'IgnoreCase', true)
    disp("PYTHON is present");
else
    disp("PYTHON is not present");
end
fprintf('\n');