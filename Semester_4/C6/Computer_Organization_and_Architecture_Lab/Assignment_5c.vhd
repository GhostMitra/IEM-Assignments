-- 3:8 Decoder using FOR loop (Behavioral)

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_5c is
    Port (
        input  : in  STD_LOGIC_VECTOR(2 downto 0);
        output : out STD_LOGIC_VECTOR(7 downto 0)
    );
end Assignment_5c;

architecture Behavioral of Assignment_5c is
begin
    process(input)
    begin
        for i in 0 to 7 loop
            if i = to_integer(unsigned(input)) then
                output(i) <= '1';
            else
                output(i) <= '0';
            end if;
        end loop;
    end process;
end Behavioral;

architecture Dataflow of Assignment_5c is
begin

    gen_dec : for i in 0 to 7 generate
        output(i) <= '1' when to_integer(unsigned(input)) = i else '0';
    end generate;

end Dataflow;