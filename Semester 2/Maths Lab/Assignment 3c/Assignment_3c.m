Coeff_matrix = [-1 3 7; 2 -2 -2; 1 -1 -1];
Const_matrix = [5; 1; -2];
display("Coefficient Matrix = ");
display(Coeff_matrix);
display("Constant Matrix = ");
display(Const_matrix);
[NumRows NumCols]=size(Coeff_matrix);
if(rank(Coeff_matrix) == rank([Coeff_matrix Const_matrix])) && (NumCols == rank(Coeff_matrix))
    display("Solution = ");
    display(inv(Coeff_matrix)*Const_matrix);
elseif(rank(Coeff_matrix) == rank([Coeff_matrix Const_matrix])) && (NumCols > rank(Coeff_matrix))
    display("Infinitely Many Solution");
else
    display("No solution");
end