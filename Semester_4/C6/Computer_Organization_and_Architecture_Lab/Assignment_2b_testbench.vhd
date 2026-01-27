library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_2b_testbench is
end Assignment_2b_testbench;

architecture Behavioral of Assignment_2b_testbench is
    signal A, B   : STD_LOGIC := '0';
    signal DIFF    : STD_LOGIC;
    signal BORROW  : STD_LOGIC;
begin
    uut: entity work.Assignment_2b
        port map (A => A, B => B, DIFF => DIFF, BORROW => BORROW);

    process
    begin
        A <= '0'; B <= '0'; wait for 100 ns;
        A <= '0'; B <= '1'; wait for 100 ns;
        A <= '1'; B <= '0'; wait for 100 ns;
        A <= '1'; B <= '1'; wait for 100 ns;
        wait;
    end process;
end Behavioral;
