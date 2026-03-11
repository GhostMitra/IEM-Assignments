-- Testbench for 2:4 Decoder with 200 ns delay

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_6a_testbench is
end Assignment_6a_testbench;

architecture Behavioral of Assignment_6a_testbench is

    component Assignment_6a
        Port (
            input  : in  STD_LOGIC_VECTOR(1 downto 0);
            output : out STD_LOGIC_VECTOR(3 downto 0)
        );
    end component;

    signal input  : STD_LOGIC_VECTOR(1 downto 0);
    signal output : STD_LOGIC_VECTOR(3 downto 0);

begin

    uut: Assignment_6a port map (
        input  => input,
        output => output
    );

    process
    begin
        input <= "00"; wait for 200 ns;
        input <= "01"; wait for 200 ns;
        input <= "10"; wait for 200 ns;
        input <= "11"; wait for 200 ns;
        wait;
    end process;

end Behavioral;