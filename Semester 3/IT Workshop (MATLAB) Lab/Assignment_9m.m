% Question13: Extract all words (sequences of letters) from a string.
q13 = "welcome2025toMATLAB";
disp("String taken: " + q13);
insert_q13 = insertAfter(q13, "welcome2025to", " ");
words_q13 = extract(insert_q13, lettersPattern);
disp("Words extracted: " + words_q13);
fprintf('\n');