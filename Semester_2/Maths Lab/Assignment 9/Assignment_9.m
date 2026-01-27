% Importing an Excel file into Matlab File
data = readtable('X_Section_Math_Score.xlsx');
disp('Data Read: ');
disp(data);
% Dimension of the dataset
dimension = size(data);
disp('Dimension = ')
disp(dimension);
% Basic Information on the dataset
summary(data);
% Extraction of specific column
marksobtained = data.TM;
disp('Marks Obtained = ');
disp(marksobtained);
% Mean
average.TM.marks = mean(marksobtained);
disp('Average Marks = ');
disp(average.TM.marks);
% Standard deviation
standard.deviation = std(marksobtained);
disp('Standard Deviation Marks = ');
disp(standard.deviation);
% If the code of median and mode
% will not run for second/third time
% then use the command “clear median” in workspace for
% median or use “clear mode” in workspace for mode
% Median
med.marks = median(marksobtained);
disp('Median Marks = ');
disp(med.marks)
% Mode
mo.marks = mode(marksobtained);
disp('Mode Marks = ');
disp(mo.marks)
% histogram of any dataset
subplot(2, 2, 1)
histogram(marksobtained);
title('By Default');
% histogram with variable bin size
subplot(2, 2, 2)
histogram(marksobtained, 10);
title('bin size = 10');
subplot(2, 2, 3)
histogram(marksobtained, 15);
title('bin size = 15');
% Probability density histogram
subplot(2, 2, 4)
histogram(marksobtained, 'Normalization','pdf');
title('Probability Density Histogram');

% scatter diagram
q11 = data.Q11;
figure; % switching back to whole figure
scatter(q11, marksobtained);
title('Scatterplot');
xlabel('Roll Number');
ylabel('Marks');
legend('Plot');