syms x y;
f1 = exp(x.^2 + y.^2);
p = diff(f1,x);
q = diff(f1,y);
p1 = diff(f1,x,x);
q1 = diff(f1,y,y);
p2 = diff(f1,y,x);
q2 = diff(f1,x,y);
p_subs = subs(p,{x,y},{-1,1});
q_subs = subs(q,{x,y},{-1,1});
p1_subs = subs(p1,{x,y},{-1,1});
q1_subs = subs(q1,{x,y},{-1,1});
p2_subs = subs(p2,{x,y},{-1,1});
q2_subs = subs(q2,{x,y},{-1,1});
if(p2_subs == q2_subs)
    disp('Mixed partial derivative are same at (-1,1)');
else
    disp('Mixed partial derivative are not same at (-1,1)');
end