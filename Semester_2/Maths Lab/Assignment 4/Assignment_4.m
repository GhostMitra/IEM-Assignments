syms x y z;
f = x.^2 + y.^2 + z.^2;
F = [x*y, y*z, z*x];
disp('Scalar Function f = ');
disp(f);
disp('Vector Function F = ');
disp(F);
grad_f = gradient(f,[x,y,z]);
disp('grad(f) at (x,y,z) = ');
disp(grad_f);
div_F = divergence(F,[x,y,z]);
disp('div(F) at (x,y,z) = ');
disp(div_F);
curl_F = curl(F,[x,y,z]);
disp('curl(F) at (x,y,z) = ')
disp(curl_F);