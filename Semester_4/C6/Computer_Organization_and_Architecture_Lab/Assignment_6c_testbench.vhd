library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_6c_testbench is
end Assignment_6c_testbench;

architecture Behavioral of Assignment_6c_testbench is

    -- Component declaration
    component Assignment_6c
        Port (
            input  : in  STD_LOGIC_VECTOR(7 downto 0);
            output : out STD_LOGIC_VECTOR(2 downto 0)
        );
    end component;

    -- Test signals
    signal input  : STD_LOGIC_VECTOR(7 downto 0);
    signal output : STD_LOGIC_VECTOR(2 downto 0);

begin

    -- Instantiate Unit Under Test
    uut: Assignment_6c
        port map (
            input  => input,
            output => output
        );

    -- Stimulus process
    stim_proc: process
    begin

        input <= "00000001"; wait for 125 ns;
        input <= "00000010"; wait for 125 ns;
        input <= "00000100"; wait for 125 ns;
        input <= "00001000"; wait for 125 ns;
        input <= "00010000"; wait for 125 ns;
        input <= "00100000"; wait for 125 ns;
        input <= "01000000"; wait for 125 ns;
        input <= "10000000"; wait for 125 ns;

        wait;
    end process;

end Behavioral;