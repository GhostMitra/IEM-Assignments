library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_3d is
    Port (
        A    : in  STD_LOGIC_VECTOR(3 downto 0);
        B    : in  STD_LOGIC_VECTOR(3 downto 0);
        Cin  : in  STD_LOGIC;
        Sum  : out STD_LOGIC_VECTOR(3 downto 0);
        Cout : out STD_LOGIC
    );
end Assignment_3d;

architecture Behavioral of Assignment_3d is
begin
    process(A, B, Cin)
        variable temp  : unsigned(4 downto 0);
        variable cin_u : unsigned(4 downto 0);
    begin
        -- Convert Cin safely
        if Cin = '1' then
            cin_u := to_unsigned(1, 5);
        else
            cin_u := to_unsigned(0, 5);
        end if;

        temp := resize(unsigned(A), 5)
              + resize(unsigned(B), 5)
              + cin_u;

        Sum  <= std_logic_vector(temp(3 downto 0));
        Cout <= temp(4);
    end process;
end Behavioral;

architecture Dataflow of Assignment_3d is
    signal temp  : unsigned(4 downto 0);
    signal cin_u : unsigned(4 downto 0);
begin
    cin_u <= to_unsigned(1, 5) when Cin = '1' else to_unsigned(0, 5);

    temp <= resize(unsigned(A), 5)
          + resize(unsigned(B), 5)
          + cin_u;

    Sum  <= std_logic_vector(temp(3 downto 0));
    Cout <= temp(4);
end Dataflow;
