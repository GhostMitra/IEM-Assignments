library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_3c_testbench is
end Assignment_3c_testbench;

architecture behavior of Assignment_3c_testbench is

    component Assignment_3c
        Port (
            A : in  STD_LOGIC_VECTOR(7 downto 0);
            B : in  STD_LOGIC_VECTOR(7 downto 0);
            P : out STD_LOGIC_VECTOR(15 downto 0)
        );
    end component;

    signal A : STD_LOGIC_VECTOR(7 downto 0);
    signal B : STD_LOGIC_VECTOR(7 downto 0);
    signal P : STD_LOGIC_VECTOR(15 downto 0);

begin

    uut: Assignment_3c
        port map (
            A => A,
            B => B,
            P => P
        );

    stim_proc: process
    begin
        -- Case 1: Simple multiplication
        A <= "00001010"; -- 10
        B <= "00000101"; -- 5
        wait for 100 ns;

        -- Case 2: Square of a number
        A <= "00001111"; -- 15
        B <= "00001111"; -- 15
        wait for 100 ns;

        -- Case 3: Large  small (checks upper bits)
        A <= "11111111"; -- 255
        B <= "00000010"; -- 2
        wait for 100 ns;

        -- Case 4: Maximum  maximum
        A <= "11111111"; -- 255
        B <= "11111111"; -- 255
        wait for 100 ns;

        wait; -- stop simulation
    end process;

end behavior;
