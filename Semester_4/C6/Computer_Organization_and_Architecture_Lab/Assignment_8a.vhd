library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Half Adder
entity Assignment_8a_half_adder is
    Port(
        a : in STD_LOGIC;
        b : in STD_LOGIC;
        sum : out STD_LOGIC;
        carry : out STD_LOGIC
    );
end Assignment_8a_half_adder;

architecture Behavioral of Assignment_8a_half_adder is
begin
    sum <= a xor b;
    carry <= a and b;
end Behavioral;



library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- OR Gate
entity Assignment_8a_or_gate is
    Port(
        a : in STD_LOGIC;
        b : in STD_LOGIC;
        output : out STD_LOGIC
    );
end Assignment_8a_or_gate;

architecture Behavioral of Assignment_8a_or_gate is
begin
    output <= a or b;
end Behavioral;



library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Full Adder (Structural)
entity Assignment_8a is
    Port(
        a : in STD_LOGIC;
        b : in STD_LOGIC;
        c : in STD_LOGIC;
        sum : out STD_LOGIC;
        carry : out STD_LOGIC
    );
end Assignment_8a;

architecture Structural of Assignment_8a is

    signal s1, c1, c2 : STD_LOGIC;

    component Assignment_8a_half_adder
        Port(
            a : in STD_LOGIC;
            b : in STD_LOGIC;
            sum : out STD_LOGIC;
            carry : out STD_LOGIC
        );
    end component;

    component Assignment_8a_or_gate
        Port(
            a : in STD_LOGIC;
            b : in STD_LOGIC;
            output : out STD_LOGIC
        );
    end component;

begin

    ha1: Assignment_8a_half_adder
        port map(
            a => a,
            b => b,
            sum => s1,
            carry => c1
        );

    ha2: Assignment_8a_half_adder
        port map(
            a => s1,
            b => c,
            sum => sum,
            carry => c2
        );

    or1: Assignment_8a_or_gate
        port map(
            a => c1,
            b => c2,
            output => carry
        );

end Structural;