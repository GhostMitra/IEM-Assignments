% Question12: Erase all occurrences of a substring.
q12 = "He is a good good boy";
disp("String taken: " + q12);
erase_q12 = erase(q12, "good ");
fprintf("Old String: %s\n", q12);
fprintf("New String: %s\n\n", erase_q12);