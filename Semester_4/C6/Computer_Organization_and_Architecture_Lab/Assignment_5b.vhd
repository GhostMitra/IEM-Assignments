library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_5b is
    Port (
        input  : in  STD_LOGIC_VECTOR(1 downto 0);
        output : out STD_LOGIC_VECTOR(3 downto 0)
    );
end Assignment_5b;

architecture Behavioral of Assignment_5b is
begin
    process(input)
        variable temp : STD_LOGIC_VECTOR(3 downto 0);
        variable idx  : integer;
    begin
        temp := "0000";
        idx := to_integer(unsigned(input));

        for i in 0 to 3 loop
            if i = idx then
                temp(i) := '1';
            end if;
        end loop;

        output <= temp;
    end process;
end Behavioral;

architecture Dataflow of Assignment_5b is
begin
    output(0) <= (not input(1)) and (not input(0));
    output(1) <= (not input(1)) and input(0);
    output(2) <= input(1) and (not input(0));
    output(3) <= input(1) and input(0);
end Dataflow;