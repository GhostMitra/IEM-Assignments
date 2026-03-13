library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_8a_testbench is
end Assignment_8a_testbench;

architecture Behavioral of Assignment_8a_testbench is

    component Assignment_8a
        Port(
            a : in STD_LOGIC;
            b : in STD_LOGIC;
            c : in STD_LOGIC;
            sum : out STD_LOGIC;
            carry : out STD_LOGIC
        );
    end component;

    signal a, b, c : STD_LOGIC;
    signal sum, carry : STD_LOGIC;

begin

    uut: Assignment_8a
        port map(
            a => a,
            b => b,
            c => c,
            sum => sum,
            carry => carry
        );

    process
    begin

        a <= '0'; b <= '0'; c <= '0';
        wait for 125 ns;

        a <= '0'; b <= '0'; c <= '1';
        wait for 125 ns;

        a <= '0'; b <= '1'; c <= '0';
        wait for 125 ns;

        a <= '0'; b <= '1'; c <= '1';
        wait for 125 ns;

        a <= '1'; b <= '0'; c <= '0';
        wait for 125 ns;

        a <= '1'; b <= '0'; c <= '1';
        wait for 125 ns;

        a <= '1'; b <= '1'; c <= '0';
        wait for 125 ns;

        a <= '1'; b <= '1'; c <= '1';
        wait for 125 ns;

        wait;
    end process;

end Behavioral;