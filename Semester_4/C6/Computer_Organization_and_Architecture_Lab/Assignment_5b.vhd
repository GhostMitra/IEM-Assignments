library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_5b is
    Port (
        input : in  STD_LOGIC_VECTOR(1 downto 0);
        output : out STD_LOGIC_VECTOR(3 downto 0)
    );
end Assignment_5b;

architecture Behavioral of Assignment_5b is
begin
    process(input)
    begin
        case input is
            when "00" => output <= "0001";
            when "01" => output <= "0010";
            when "10" => output <= "0100";
            when "11" => output <= "1000";
            when others => output <= "0000";
        end case;
    end process;
end Behavioral;

architecture Dataflow of Assignment_5b is
begin
    output(0) <= (not input(1)) and (not input(0));
    output(1) <= (not input(1)) and input(0);
    output(2) <= input(1) and (not input(0));
    output(3) <= input(1) and input(0);
end Dataflow;