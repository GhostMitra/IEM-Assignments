% Write a Matlab program to find the determinant of Arix [2 3 1 4 ; 5 6 2 7 ; 8 1 9 3; 11 16 14 10] by function and sarrus method

close all;
A = [2 3 1 4 ; 5 6 2 7 ; 8 1 9 3; 11 16 14 10];
disp('Matrix A = ');
disp(A);
A(2,:) = A(2,:)-((A(2,1)/A(1,1))*A(1,:));
A(3,:) = A(3,:)-((A(3,1)/A(1,1))*A(1,:));
A(4,:) = A(4,:)-((A(4,1)/A(1,1))*A(1,:));
A(3,:) = A(3,:)-((A(3,2)/A(2,2))*A(2,:));
A(4,:) = A(4,:)-((A(4,2)/A(2,2))*A(2,:));
A(4,:) = A(4,:)-((A(4,3)/A(3,3))*A(3,:));
disp('Determinant of A (by in-built function) = ');
disp(det(A));
disp('Determinant of A (by upper triangular method) = ');
disp(prod(diag(A)));