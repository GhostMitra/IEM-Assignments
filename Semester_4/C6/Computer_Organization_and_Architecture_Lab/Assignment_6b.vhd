library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_6b is
    Port (
        input  : in  STD_LOGIC_VECTOR(3 downto 0);
        output : out STD_LOGIC_VECTOR(1 downto 0)
    );
end Assignment_6b;

architecture Behavioral of Assignment_6b is
begin
    process(input)
    begin
        case input is
            when "0001" => output <= "00";
            when "0010" => output <= "01";
            when "0100" => output <= "10";
            when "1000" => output <= "11";
            when others => output <= "00";
        end case;
    end process;
end Behavioral;

architecture Dataflow of Assignment_6b is
begin
    output(1) <= input(2) OR input(3);
    output(0) <= input(1) OR input(3);
end Dataflow;