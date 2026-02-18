library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_3e_testbench is
end Assignment_3e_testbench;

architecture behavior of Assignment_3e_testbench is

    component Assignment_3e
        Port (
            A    : in  STD_LOGIC_VECTOR(3 downto 0);
            B    : in  STD_LOGIC_VECTOR(3 downto 0);
            Bin  : in  STD_LOGIC;
            Diff : out STD_LOGIC_VECTOR(3 downto 0);
            Bout : out STD_LOGIC
        );
    end component;

    signal A    : STD_LOGIC_VECTOR(3 downto 0);
    signal B    : STD_LOGIC_VECTOR(3 downto 0);
    signal Bin  : STD_LOGIC;
    signal Diff : STD_LOGIC_VECTOR(3 downto 0);
    signal Bout : STD_LOGIC;

begin
    uut: Assignment_3e
        port map (A => A, B => B, Bin => Bin, Diff => Diff, Bout => Bout);

    stim_proc: process
    begin
        -- Case 1: Simple subtraction
        A <= "1010";  -- 10
        B <= "0101";  -- 5
        Bin <= '0';
        wait for 100 ns;

        -- Case 2: Borrow generation
        A <= "0011";  -- 3
        B <= "0111";  -- 7
        Bin <= '0';
        wait for 100 ns;

        -- Case 3: Borrow-in effect
        A <= "1000";  -- 8
        B <= "0011";  -- 3
        Bin <= '1';
        wait for 100 ns;

        -- Case 4: Underflow (max borrow)
        A <= "0000";
        B <= "0001";
        Bin <= '1';
        wait for 100 ns;

        wait;
    end process;
end behavior;
