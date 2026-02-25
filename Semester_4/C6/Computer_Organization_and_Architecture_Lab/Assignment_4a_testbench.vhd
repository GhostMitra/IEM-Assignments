-- Testbench for 4-bit Behavioral Binary to Gray (1000 ns runtime)

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_4a_testbench is
end Assignment_4a_testbench;

architecture sim of Assignment_4a_testbench is

    component Assignment_4a
        port(
            binary  : in  STD_LOGIC_VECTOR(3 downto 0);
            gray : out STD_LOGIC_VECTOR(3 downto 0)
        );
    end component;

    signal binary_in  : STD_LOGIC_VECTOR(3 downto 0);
    signal gray_o  : STD_LOGIC_VECTOR(3 downto 0);

begin

    uut: Assignment_4a
        port map(
            binary  => binary_in,
            gray => gray_o
        );

    stim: process
    begin
        for i in 0 to 15 loop
            binary_in <= std_logic_vector(to_unsigned(i,4));
            wait for 62.5 ns;
        end loop;
        wait;
    end process;

end sim;