library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_3b is
    Port (
        A    : in  STD_LOGIC_VECTOR (7 downto 0);
        B    : in  STD_LOGIC_VECTOR (7 downto 0);
        Bin  : in  STD_LOGIC;
        Diff : out STD_LOGIC_VECTOR (7 downto 0);
        Bout : out STD_LOGIC
    );
end Assignment_3b;

architecture Behavioral of Assignment_3b is
begin
    process(A, B, Bin)
        variable temp  : signed(8 downto 0);
        variable bin_s : signed(8 downto 0);
    begin
        -- Convert Bin safely
        if Bin = '1' then
            bin_s := to_signed(1, 9);
        else
            bin_s := to_signed(0, 9);
        end if;

        temp := resize(signed(A), 9)
              - resize(signed(B), 9)
              - bin_s;

        Diff <= std_logic_vector(temp(7 downto 0));
        Bout <= temp(8);
    end process;
end Behavioral;

architecture Dataflow of Assignment_3b is
    signal temp  : signed(8 downto 0);
    signal bin_s : signed(8 downto 0);
begin
    bin_s <= to_signed(1, 9) when Bin = '1' else to_signed(0, 9);

    temp <= resize(signed(A), 9)
          - resize(signed(B), 9)
          - bin_s;

    Diff <= std_logic_vector(temp(7 downto 0));
    Bout <= temp(8);   -- MSB acts as borrow
end Dataflow;
