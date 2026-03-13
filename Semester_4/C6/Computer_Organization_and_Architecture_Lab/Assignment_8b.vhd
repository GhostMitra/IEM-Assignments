library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Full Adder
entity Assignment_8b_full_adder is
    Port(
        a : in STD_LOGIC;
        b : in STD_LOGIC;
        c : in STD_LOGIC;
        sum : out STD_LOGIC;
        carry : out STD_LOGIC
    );
end Assignment_8b_full_adder;

architecture Behavioral of Assignment_8b_full_adder is
begin
    sum <= a xor b xor c;
    carry <= (a and b) or (b and c) or (a and c);
end Behavioral;



library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- 4-bit Parallel Adder
entity Assignment_8b is
    Port(
        A : in STD_LOGIC_VECTOR(3 downto 0);
        B : in STD_LOGIC_VECTOR(3 downto 0);
        C : in STD_LOGIC;
        Sum : out STD_LOGIC_VECTOR(3 downto 0);
        Carry : out STD_LOGIC
    );
end Assignment_8b;

architecture Structural of Assignment_8b is

    component Assignment_8b_full_adder
        Port(
            a : in STD_LOGIC;
            b : in STD_LOGIC;
            c : in STD_LOGIC;
            sum : out STD_LOGIC;
            carry : out STD_LOGIC
        );
    end component;

    signal c1, c2, c3 : STD_LOGIC;

begin

    FA0: Assignment_8b_full_adder
        port map(A(0), B(0), C, Sum(0), c1);

    FA1: Assignment_8b_full_adder
        port map(A(1), B(1), c1, Sum(1), c2);

    FA2: Assignment_8b_full_adder
        port map(A(2), B(2), c2, Sum(2), c3);

    FA3: Assignment_8b_full_adder
        port map(A(3), B(3), c3, Sum(3), Carry);

end Structural;