% Write a matlab program to solve the following system of equation using gaussian elimination method
% y + z = 2
% 2x + 3z = 5
% x + y + z = 3

close all;
Coeffcient_Matrix = [0 1 1; 2 0 3; 1 1 1];
disp('Coeffcient Matrix = ');
disp(Coeffcient_Matrix);
Vector_Matrix = [2; 5; 3];
disp('Vector Matrix = ');
disp(Vector_Matrix);
Augmented_Matrix = [Coeffcient_Matrix Vector_Matrix];
Augmented_Matrix([1,2],:) = Augmented_Matrix([2,1],:);
disp('Augmented Matrix (after row swap) = ');
disp(Augmented_Matrix);
for i = 2:3
    Augmented_Matrix(i,:) = Augmented_Matrix(i,:) - (Augmented_Matrix(i,1)/Augmented_Matrix(1,1)) * Augmented_Matrix(1,:);
end
Augmented_Matrix(3,:) = Augmented_Matrix(3,:) - (Augmented_Matrix(3,2)/Augmented_Matrix(2,2)) * Augmented_Matrix(2,:);
disp('Final Augmented Matrix after elimination = ');
disp(Augmented_Matrix);
disp('Soult')
disp('x = ');
disp((Augmented_Matrix(1, end) - Augmented_Matrix(1,2) * y - Augmented_Matrix(1,3) * z) / Augmented_Matrix(1,1));
disp('y = ');
disp((Augmented_Matrix(2, end) - Augmented_Matrix(2,3) * z) / Augmented_Matrix(2,2));
disp('z = ');
disp(Augmented_Matrix(3, end) / Augmented_Matrix(3,3));
