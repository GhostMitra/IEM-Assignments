library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_3c is
    Port (
        A : in  STD_LOGIC_VECTOR(7 downto 0);
        B : in  STD_LOGIC_VECTOR(7 downto 0);
        P : out STD_LOGIC_VECTOR(15 downto 0)
    );
end Assignment_3c;

architecture Behavioral of Assignment_3c is
begin
    process(A, B)
        variable temp : unsigned(15 downto 0);
    begin
        temp := unsigned(A) * unsigned(B);
        P <= std_logic_vector(temp);
    end process;
end Behavioral;

architecture Dataflow of Assignment_3c is
begin
    P <= std_logic_vector(unsigned(A) * unsigned(B));
end Dataflow;
