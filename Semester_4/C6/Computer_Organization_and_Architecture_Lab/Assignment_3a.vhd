library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_3a is
    Port (
        A    : in  STD_LOGIC_VECTOR (7 downto 0);
        B    : in  STD_LOGIC_VECTOR (7 downto 0);
        Cin  : in  STD_LOGIC;
        Sum  : out STD_LOGIC_VECTOR (7 downto 0);
        Cout : out STD_LOGIC
    );
end Assignment_3a;

architecture Behavioral of Assignment_3a is
begin
    process(A, B, Cin)
        variable temp : unsigned(8 downto 0);
        variable cin_u : unsigned(8 downto 0);
    begin
        -- Convert Cin safely
        if Cin = '1' then
            cin_u := to_unsigned(1, 9);
        else
            cin_u := to_unsigned(0, 9);
        end if;

        temp := resize(unsigned(A), 9)
              + resize(unsigned(B), 9)
              + cin_u;

        Sum  <= std_logic_vector(temp(7 downto 0));
        Cout <= temp(8);
    end process;
end Behavioral;

architecture Dataflow of Assignment_3a is
    signal temp : unsigned(8 downto 0);
    signal cin_u : unsigned(8 downto 0);
begin
    -- Convert Cin safely
    cin_u <= to_unsigned(1, 9) when Cin = '1' else to_unsigned(0, 9);

    -- Dataflow addition
    temp <= resize(unsigned(A), 9)
          + resize(unsigned(B), 9)
          + cin_u;

    Sum  <= std_logic_vector(temp(7 downto 0));
    Cout <= temp(8);
end Dataflow;


