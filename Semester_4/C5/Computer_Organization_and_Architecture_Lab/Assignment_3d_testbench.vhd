library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_3d_testbench is
end Assignment_3d_testbench;

architecture behavior of Assignment_3d_testbench is

    component Assignment_3d
        Port (
            A    : in  STD_LOGIC_VECTOR(3 downto 0);
            B    : in  STD_LOGIC_VECTOR(3 downto 0);
            Cin  : in  STD_LOGIC;
            Sum  : out STD_LOGIC_VECTOR(3 downto 0);
            Cout : out STD_LOGIC
        );
    end component;

    signal A    : STD_LOGIC_VECTOR(3 downto 0);
    signal B    : STD_LOGIC_VECTOR(3 downto 0);
    signal Cin  : STD_LOGIC;
    signal Sum  : STD_LOGIC_VECTOR(3 downto 0);
    signal Cout : STD_LOGIC;

begin
    uut: Assignment_3d
        port map (A => A, B => B, Cin => Cin, Sum => Sum, Cout => Cout);

    stim_proc: process
    begin
        -- Case 1: Simple addition
        A <= "0011";  -- 3
        B <= "0101";  -- 5
        Cin <= '0';
        wait for 100 ns;

        -- Case 2: Carry generation
        A <= "1111";  -- 15
        B <= "0001";  -- 1
        Cin <= '0';
        wait for 100 ns;

        -- Case 3: Carry-in effect
        A <= "0111";  -- 7
        B <= "1000";  -- 8
        Cin <= '1';
        wait for 100 ns;

        -- Case 4: Maximum + maximum + carry
        A <= "1111";
        B <= "1111";
        Cin <= '1';
        wait for 100 ns;

        wait;
    end process;
end behavior;
