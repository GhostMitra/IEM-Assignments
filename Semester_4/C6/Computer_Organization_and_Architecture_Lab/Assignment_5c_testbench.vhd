-- Testbench for 3:8 Decoder using FOR loop

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_5c_testbench is
end Assignment_5c_testbench;

architecture Behavioral of Assignment_5c_testbench is

    component Assignment_5c
        Port (
            input  : in  STD_LOGIC_VECTOR(2 downto 0);
            output : out STD_LOGIC_VECTOR(7 downto 0)
        );
    end component;

    signal input  : STD_LOGIC_VECTOR(2 downto 0);
    signal output : STD_LOGIC_VECTOR(7 downto 0);

begin

    -- DUT instantiation
    uut: Assignment_5c port map (
        input  => input,
        output => output
    );

    -- Stimulus using loop
    process
    begin
        for i in 0 to 7 loop
            input <= std_logic_vector(to_unsigned(i,3));
            wait for 125 ns;
        end loop;
        wait;
    end process;

end Behavioral;