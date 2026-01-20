% Question14: Reformat a string by inserting a space.
q14 = "RollNo123";
disp("String taken: " + q14);
insert_q14 = insertAfter(q14, "RollNo", ' ');
fprintf("Old String: %s\n", q14);
fprintf("New String: %s\n\n", insert_q14);