% Question8: Insert a substring after a specified pattern.
q8 = "I like programming";
disp("String taken: " + q8);
insert_q8 = insertAfter(q8, "like", " MATLAB");
fprintf("Old String: %s\n", q8);
fprintf("New String: %s\n\n", insert_q8);