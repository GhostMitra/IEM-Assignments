library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_4b_testbench is
end Assignment_4b_testbench;

architecture sim of Assignment_4b_testbench is

    component Assignment_4b
        port(
            gray   : in  STD_LOGIC_VECTOR(3 downto 0);
            binary : out STD_LOGIC_VECTOR(3 downto 0)
        );
    end component;

    signal gray_in  : STD_LOGIC_VECTOR(3 downto 0);
    signal binary_o: STD_LOGIC_VECTOR(3 downto 0);

begin

    uut: Assignment_4b
        port map(
            gray   => gray_in,
            binary => binary_o
        );

    stim: process
        type gray_array is array (0 to 15) of STD_LOGIC_VECTOR(3 downto 0);
        constant gray_seq : gray_array := (
            "0000","0001","0011","0010",
            "0110","0111","0101","0100",
            "1100","1101","1111","1110",
            "1010","1011","1001","1000"
        );
    begin
        for i in 0 to 15 loop
            gray_in <= gray_seq(i);
            wait for 62.5 ns;
        end loop;
        wait;
    end process;

end sim;