% Question10: Compare two strings for equality (case-sensitive).
q10_1 = "Civil";
q10_2 = "civil";
disp("Strings taken: '" + q10_1 + "' and '" + q10_2 + "'");
if q10_1 == q10_2
    disp("Both strings are same");
else
    disp("Both strings are not same");
end
fprintf('\n');