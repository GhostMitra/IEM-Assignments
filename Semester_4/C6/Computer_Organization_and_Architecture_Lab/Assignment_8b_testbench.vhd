library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_8b_testbench is
end Assignment_8b_testbench;

architecture behavior of Assignment_8b_testbench is

    component Assignment_8b
        Port (
            A    : in  STD_LOGIC_VECTOR(3 downto 0);
            B    : in  STD_LOGIC_VECTOR(3 downto 0);
            C  : in  STD_LOGIC;
            Sum  : out STD_LOGIC_VECTOR(3 downto 0);
            Carry : out STD_LOGIC
        );
    end component;

    signal A    : STD_LOGIC_VECTOR(3 downto 0);
    signal B    : STD_LOGIC_VECTOR(3 downto 0);
    signal C  : STD_LOGIC;
    signal Sum  : STD_LOGIC_VECTOR(3 downto 0);
    signal Carry : STD_LOGIC;

begin
    uut: Assignment_8b
        port map (A => A, B => B, C => C, Sum => Sum, Carry => Carry);

    stim_proc: process
    begin
        -- Case 1: Simple addition
        A <= "0011";  -- 3
        B <= "0101";  -- 5
        C <= '0';
        wait for 100 ns;

        -- Case 2: Carry generation
        A <= "1111";  -- 15
        B <= "0001";  -- 1
        C <= '0';
        wait for 100 ns;

        -- Case 3: Carry-in effect
        A <= "0111";  -- 7
        B <= "1000";  -- 8
        C <= '1';
        wait for 100 ns;

        -- Case 4: Maximum + maximum + carry
        A <= "1111";
        B <= "1111";
        C <= '1';
        wait for 100 ns;

        wait;
    end process;
end behavior;
