library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_3b_testbench is
end Assignment_3b_testbench;

architecture behavior of Assignment_3b_testbench is

    component Assignment_3b
        Port (
            A    : in  STD_LOGIC_VECTOR (7 downto 0);
            B    : in  STD_LOGIC_VECTOR (7 downto 0);
            Bin  : in  STD_LOGIC;
            Diff : out STD_LOGIC_VECTOR (7 downto 0);
            Bout : out STD_LOGIC
        );
    end component;

    signal A    : STD_LOGIC_VECTOR (7 downto 0);
    signal B    : STD_LOGIC_VECTOR (7 downto 0);
    signal Bin  : STD_LOGIC;
    signal Diff : STD_LOGIC_VECTOR (7 downto 0);
    signal Bout : STD_LOGIC;

begin

    uut: Assignment_3b
        port map (
            A    => A,
            B    => B,
            Bin  => Bin,
            Diff => Diff,
            Bout => Bout
        );

    stim_proc: process
    begin
        -- Case 1: Simple subtraction (no borrow)
        A <= "00010100"; -- 20
        B <= "00001010"; -- 10
        Bin <= '0';
        wait for 100 ns;

        -- Case 2: Borrow generation
        A <= "00000000"; -- 0
        B <= "00000001"; -- 1
        Bin <= '0';
        wait for 100 ns;

        -- Case 3: Borrow-in effect
        A <= "00110010"; -- 50
        B <= "00011001"; -- 25
        Bin <= '1';
        wait for 100 ns;

        -- Case 4: Maximum values (underflow)
        A <= "11111111"; -- 255
        B <= "11111111"; -- 255
        Bin <= '1';
        wait for 100 ns;

        wait; -- stop simulation
    end process;

end behavior;
