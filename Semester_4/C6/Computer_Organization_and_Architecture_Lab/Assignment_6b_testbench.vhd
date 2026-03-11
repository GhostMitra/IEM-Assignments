library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_6b_testbench is
end Assignment_6b_testbench;

architecture Behavioral of Assignment_6b_testbench is

    -- Component declaration
    component Assignment_6b
        Port (
            input  : in  STD_LOGIC_VECTOR(3 downto 0);
            output : out STD_LOGIC_VECTOR(1 downto 0)
        );
    end component;

    -- Test signals
    signal input  : STD_LOGIC_VECTOR(3 downto 0);
    signal output : STD_LOGIC_VECTOR(1 downto 0);

begin

    -- Instantiate Unit Under Test (UUT)
    uut: Assignment_6b
        port map (
            input  => input,
            output => output
        );

    -- Stimulus process
    stim_proc: process
    begin

        input <= "0001";
        wait for 250 ns;

        input <= "0010";
        wait for 250 ns;

        input <= "0100";
        wait for 250 ns;

        input <= "1000";
        wait for 250 ns;

        wait;
    end process;

end Behavioral;