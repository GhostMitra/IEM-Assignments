library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_2c_testbench is
end Assignment_2c_testbench;

architecture Behavioral of Assignment_2c_testbench is
    signal A, B, C : STD_LOGIC := '0';
    signal SUM     : STD_LOGIC;
    signal CARRY   : STD_LOGIC;
begin
    uut: entity work.Assignment_2c
        port map (A => A, B => B, C => C, SUM => SUM, CARRY => CARRY);

    process
    begin
        A <= '0'; B <= '0'; C <= '0'; wait for 100 ns;
        A <= '0'; B <= '0'; C <= '1'; wait for 100 ns;
        A <= '0'; B <= '1'; C <= '0'; wait for 100 ns;
        A <= '0'; B <= '1'; C <= '1'; wait for 100 ns;
        A <= '1'; B <= '0'; C <= '0'; wait for 100 ns;
        A <= '1'; B <= '0'; C <= '1'; wait for 100 ns;
        A <= '1'; B <= '1'; C <= '0'; wait for 100 ns;
        A <= '1'; B <= '1'; C <= '1'; wait for 100 ns;
        wait;
    end process;
end Behavioral;
