% Question9: Pad a string with a character to a specific length.
q9 = "MATLAB";
disp("String taken: " + q9);
pad_q9 = pad(q9, 12, 'both', "*");
fprintf("Old String: %s\n", q9);
fprintf("New String: %s\n\n", pad_q9);