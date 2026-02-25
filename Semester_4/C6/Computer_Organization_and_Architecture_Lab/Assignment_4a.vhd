library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_4a is
    port(
        binary  : in  STD_LOGIC_VECTOR(3 downto 0);
        gray : out STD_LOGIC_VECTOR(3 downto 0)
    );
end Assignment_4a;

architecture behavioral of Assignment_4a is
begin
    process(binary)
    begin
        gray(3) <= binary(3);
        for i in 2 downto 0 loop
            gray(i) <= binary(i+1) xor binary(i);
        end loop;
    end process;
end behavioral;

architecture dataflow of Assignment_4a is
begin
    gray(3) <= binary(3);
    gen_gray: for i in 2 downto 0 generate
        gray(i) <= binary(i+1) xor binary(i);
    end generate;
end dataflow;