A = [-1 0 3 0; -4 0 1 3; 3 4 0 1; 4 0 1 3];
disp("Matrix = ");
disp(A);
order = size(A);
disp("Order = ");
disp(order);
n = min(order);
disp("Minimum Order = ");
disp(n);
rank_of_matrix = rank(A);
disp("Rank = ");
disp(rank_of_matrix);
determinant_of_matrix = det(A);
disp("Determinant = ");
disp(determinant_of_matrix);
if (determinant_of_matrix ~= 0)
  inverse = inv(A);
  disp("Inverse = ");
  disp(inverse)
else
    disp("Inverse does not exist")
end
[eigen_value, eigen_vector]= eig(A);
disp("Eigen Values = ");
disp(eigen_value);
disp("Eigen Vectors = ");
disp(eigen_vector);