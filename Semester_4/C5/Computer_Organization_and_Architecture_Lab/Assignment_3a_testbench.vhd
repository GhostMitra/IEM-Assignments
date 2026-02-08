library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_3a_testbench is
end Assignment_3a_testbench;

architecture behavior of Assignment_3a_testbench is

    component Assignment_3a
        Port (
            A    : in  STD_LOGIC_VECTOR (7 downto 0);
            B    : in  STD_LOGIC_VECTOR (7 downto 0);
            Cin  : in  STD_LOGIC;
            Sum  : out STD_LOGIC_VECTOR (7 downto 0);
            Cout : out STD_LOGIC
        );
    end component;

    signal A    : STD_LOGIC_VECTOR (7 downto 0);
    signal B    : STD_LOGIC_VECTOR (7 downto 0);
    signal Cin  : STD_LOGIC;
    signal Sum  : STD_LOGIC_VECTOR (7 downto 0);
    signal Cout : STD_LOGIC;

begin

    uut: Assignment_3a
        port map (
            A    => A,
            B    => B,
            Cin  => Cin,
            Sum  => Sum,
            Cout => Cout
        );

    stim_proc: process
    begin
        -- Case 1: Simple addition (no carry)
        A <= "00001010"; -- 10
        B <= "00000101"; -- 5
        Cin <= '0';
        wait for 100 ns;

        -- Case 2: Carry generation
        A <= "11111111"; -- 255
        B <= "00000001"; -- 1
        Cin <= '0';
        wait for 100 ns;

        -- Case 3: Carry-in effect
        A <= "01010101"; -- 85
        B <= "00110011"; -- 51
        Cin <= '1';
        wait for 100 ns;

        -- Case 4: Maximum inputs + carry-in
        A <= "11111111";
        B <= "11111111";
        Cin <= '1';
        wait for 100 ns;

        wait; -- stop simulation
    end process;

end behavior;
