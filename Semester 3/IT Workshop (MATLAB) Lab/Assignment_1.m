% Write a matlab program to find the determinant of matrix [1 -2 3; 2 0 3; 1 5 4] by function and sarrus method

close all;
A = [1 -2 3; 2 0 3; 1 5 4];
disp('Matrix A = ');
disp(A);
disp('Determinant of A (by in-built function) = ');
disp(det(A));
disp('Determinant of A (by Sarrus Method) = ');
disp(A(1,1)*A(2,2)*A(3,3) + A(2,1)*A(3,2)*A(1,3) + A(3,1)*A(1,2)*A(2,3) - (A(1,3)*A(2,2)*A(3,1) + A(2,3)*A(3,2)*A(1,1) + A(3,3)*A(1,2)*A(2,1)));