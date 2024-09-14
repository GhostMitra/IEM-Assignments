close all
Subjects=[1 2 3 4 5 6 7]
MyMarks=[25 20 18 18 15 21 22]
FriendsMarks=[11 22 25 20 14 15 11]
plot(Subjects, MyMarks, "r*")
hold on
plot(Subjects, FriendsMarks, "bo")
xlabel('Subjects')
ylabel('Marks')
legend('MyMarks', 'FriendsMarks')

