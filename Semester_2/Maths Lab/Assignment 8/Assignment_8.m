syms x y z;
f = x^2 * y^2 * z^2;
disp('Function f = ');
disp(f);
grad = gradient(f,[x,y,z]);
disp ('gradient of f at (x,y,z)')
disp(grad);
b = subs(grad, [x,y,z], [1,1,1]);
c = double(b);
disp ('gradient of f at (1,1,1)')
disp(c);
a = [2,-1,4];
magnitude = norm(a);
unit_vec = a/magnitude;
direc_deriv = dot(b,unit_vec);
disp('Directional Derivative of f at (1,1,1) along 2i^ - j^ + 4k^ = ')
disp(direc_deriv);