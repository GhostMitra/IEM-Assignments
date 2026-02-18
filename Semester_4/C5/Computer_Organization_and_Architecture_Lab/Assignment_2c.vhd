----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    05:34:20 01/21/2026 
-- Design Name: 
-- Module Name:    Assignment_2c - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity Assignment_2c is
    Port ( A     : in  STD_LOGIC;
           B     : in  STD_LOGIC;
           C     : in  STD_LOGIC;
           SUM   : out STD_LOGIC;
           CARRY : out STD_LOGIC);
end Assignment_2c;

architecture Behavioral of Assignment_2c is
begin
Process(A,B,C)
begin
if (A='0') then
    if (B='0') then
        SUM   <= C;
        CARRY <= '0';
    else
        SUM   <= not C;
        CARRY <= C;
    end if;
else
    if (B='0') then
        SUM   <= not C;
        CARRY <= C;
    else
        SUM   <= C;
        CARRY <= '1';
    end if;
end if;
end Process;
end Behavioral;

architecture Dataflow of Assignment_2c is
begin
    SUM   <= A xor B xor C;
    CARRY <= (A and B) or (B and C) or (A and C);
end Dataflow;

