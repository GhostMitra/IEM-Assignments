----------------------------------------------------------------------------------
-- Testbench for 4-bit Comparator (Behavioral)
----------------------------------------------------------------------------------

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_5a_testbench is
end Assignment_5a_testbench;

architecture Behavioral of Assignment_5a_testbench is

    component Assignment_5a
        Port (
            A  : in  STD_LOGIC_VECTOR(3 downto 0);
            B  : in  STD_LOGIC_VECTOR(3 downto 0);
            GT : out STD_LOGIC;
            EQ : out STD_LOGIC;
            LT : out STD_LOGIC
        );
    end component;

    signal A  : STD_LOGIC_VECTOR(3 downto 0);
    signal B  : STD_LOGIC_VECTOR(3 downto 0);
    signal GT : STD_LOGIC;
    signal EQ : STD_LOGIC;
    signal LT : STD_LOGIC;

begin

    -- Instantiate DUT
    uut: Assignment_5a port map (
        A  => A,
        B  => B,
        GT => GT,
        EQ => EQ,
        LT => LT
    );

    -- Stimulus process
    process
    begin
        for i in 2 to 4 loop
            A <= std_logic_vector(to_unsigned(i,4));
            B <= std_logic_vector(to_unsigned(3,4));
            wait for 200 ns;
        end loop;

        wait;
    end process;

end Behavioral;