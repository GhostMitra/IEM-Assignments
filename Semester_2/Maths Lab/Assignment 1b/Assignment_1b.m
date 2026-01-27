syms x y;
f1 = sin(x)*cos(y);
p = diff(f1,x);
q = diff(f1,y);
p1 = diff(f1,x,x);
q1 = diff(f1,y,y);
p2 = diff(f1,y,x);
q2 = diff(f1,x,y);
p_subs = subs(p,{x,y},{-pi/2,pi/2});
q_subs = subs(q,{x,y},{-pi/2,pi/2});
p1_subs = subs(p1,{x,y},{-pi/2,pi/2});
q1_subs = subs(q1,{x,y},{-pi/2,pi/2});
p2_subs = subs(p2,{x,y},{-pi/2,pi/2});
q2_subs = subs(q2,{x,y},{-pi/2,pi/2});
if(p2_subs == q2_subs)
    disp('Mixed partial derivative are same at (-pi/2,pi/2)');
else
    disp('Mixed partial derivative are not same at (-pi/2,pi/2)');
end