library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_3e is
    Port (
        A    : in  STD_LOGIC_VECTOR (3 downto 0);
        B    : in  STD_LOGIC_VECTOR (3 downto 0);
        Bin  : in  STD_LOGIC;
        Diff : out STD_LOGIC_VECTOR (3 downto 0);
        Bout : out STD_LOGIC
    );
end Assignment_3e;

architecture Behavioral of Assignment_3e is
begin
    process(A, B, Bin)
        variable temp  : signed(4 downto 0);
        variable bin_s : signed(4 downto 0);
    begin
        -- Convert Bin safely
        if Bin = '1' then
            bin_s := to_signed(1, 5);
        else
            bin_s := to_signed(0, 5);
        end if;

        temp := resize(signed(A), 5)
              - resize(signed(B), 5)
              - bin_s;

        Diff <= std_logic_vector(temp(3 downto 0));
        Bout <= temp(4);   -- MSB acts as borrow
    end process;
end Behavioral;


architecture Dataflow of Assignment_3e is
    signal temp  : signed(4 downto 0);
    signal bin_s : signed(4 downto 0);
begin
    bin_s <= to_signed(1, 5) when Bin = '1' else to_signed(0, 5);

    temp <= resize(signed(A), 5)
          - resize(signed(B), 5)
          - bin_s;

    Diff <= std_logic_vector(temp(3 downto 0));
    Bout <= temp(4);
end Dataflow;
