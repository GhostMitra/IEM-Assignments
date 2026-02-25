library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity Assignment_5a is
    Port (
        A  : in  STD_LOGIC_VECTOR(3 downto 0);
        B  : in  STD_LOGIC_VECTOR(3 downto 0);
        GT : out STD_LOGIC;
        EQ : out STD_LOGIC;
        LT : out STD_LOGIC
    );
end Assignment_5a;

architecture Behavioral of Assignment_5a is
begin

    process(A, B)
    begin
        if unsigned(A) > unsigned(B) then
            GT <= '1'; EQ <= '0'; LT <= '0';
        elsif unsigned(A) = unsigned(B) then
            GT <= '0'; EQ <= '1'; LT <= '0';
        else
            GT <= '0'; EQ <= '0'; LT <= '1';
        end if;
    end process;

end Behavioral;

architecture Dataflow of Assignment_5a is
begin
    GT <= '1' when unsigned(A) > unsigned(B) else '0';
    EQ <= '1' when unsigned(A) = unsigned(B) else '0';
    LT <= '1' when unsigned(A) < unsigned(B) else '0';
end Dataflow;