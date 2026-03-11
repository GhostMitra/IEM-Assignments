library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_6c is
    Port (
        input  : in  STD_LOGIC_VECTOR(7 downto 0);
        output : out STD_LOGIC_VECTOR(2 downto 0)
    );
end Assignment_6c;

-- Behavioral Architecture using LOOP
architecture Behavioral of Assignment_6c is
begin
    process(input)
        variable temp : STD_LOGIC_VECTOR(2 downto 0);
    begin
        temp := "000";
        for i in 0 to 7 loop
            if input(i) = '1' then
                temp := std_logic_vector(to_unsigned(i,3));
            end if;
        end loop;
        output <= temp;
    end process;
end Behavioral;


-- Dataflow-style Architecture using LOOP
architecture Dataflow of Assignment_6c is
begin
    process(input)
        variable temp : STD_LOGIC_VECTOR(2 downto 0);
    begin
        temp := "000";
        for i in input'range loop
            if input(i) = '1' then
                temp := std_logic_vector(to_unsigned(i,3));
            end if;
        end loop;
        output <= temp;
    end process;
end Dataflow;