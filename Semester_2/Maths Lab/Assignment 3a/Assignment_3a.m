Coeff_matrix = [-1 3 7; 2 -5 7; 1 -1 -1];
Const_matrix = [5; 7; -2];
disp('Coefficient Matrix = ');
disp(Coeff_matrix);
disp('Constant Matrix = ');
disp(Const_matrix);
[NumRows, NumCols]=size(Coeff_matrix);
if(rank(Coeff_matrix) == rank([Coeff_matrix Const_matrix])) && (NumCols == rank(Coeff_matrix))
    disp('Solution = ');
    disp(inv(Coeff_matrix)*Const_matrix);
elseif(rank(Coeff_matrix) == rank([Coeff_matrix Const_matrix])) && (NumCols > rank(Coeff_matrix))
    disp('Infinitely Many Solution');
else
    disp('No solution');
end