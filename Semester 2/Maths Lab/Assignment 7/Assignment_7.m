syms x y z;
F = [x.^log(y), y.^log(x), z.^log(x*y)];
disp('Vector Function F = ');
disp(F);
div_F = divergence(F,[x,y,z]);
disp('div(F) at (x,y,z) = ');
disp(div_F);
curl_F = curl(F,[x,y,z]);
disp('curl(F) at (x,y,z) = ')
disp(curl_F);