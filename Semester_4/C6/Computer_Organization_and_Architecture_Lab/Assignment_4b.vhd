library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Assignment_4b is
    port(
        gray   : in  STD_LOGIC_VECTOR(3 downto 0);
        binary : out STD_LOGIC_VECTOR(3 downto 0)
    );
end Assignment_4b;

architecture behavioral of Assignment_4b is
    signal bin_int : STD_LOGIC_VECTOR(3 downto 0);
begin
    process(gray)
    begin
        bin_int(3) <= gray(3);
        for i in 2 downto 0 loop
            bin_int(i) <= bin_int(i+1) xor gray(i);
        end loop;
    end process;

    binary <= bin_int;
end behavioral;

architecture dataflow of Assignment_4b is
    signal bin_int : STD_LOGIC_VECTOR(3 downto 0);
begin
    bin_int(3) <= gray(3);

    gen_binary: for i in 2 downto 0 generate
        bin_int(i) <= bin_int(i+1) xor gray(i);
    end generate;

    binary <= bin_int;
end dataflow;