syms x y z;
f = (x.^2 + y.^2 + z.^2).^(3/2);
disp('Scalar Function f = ');
disp(f);
grad_f = gradient(f,[x,y,z]);
disp('grad(f) at (x,y,z) = ');
disp(grad_f);