% Question 8: Display elements from a list that are at odd index positions.
my_list = [10 20 30 40 50 60 70 80 90 100];
fprintf('Elements at odd index positions:\n');
for i = 1:2:length(my_list)
    fprintf('%d ', my_list(i));
end
fprintf('\n');