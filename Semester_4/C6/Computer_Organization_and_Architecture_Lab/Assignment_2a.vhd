----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    05:28:31 01/21/2026 
-- Design Name: 
-- Module Name:    Assignment_2a - Behavioral 
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

entity Assignment_2a is
    Port ( A : in  STD_LOGIC;
           B : in  STD_LOGIC;
           SUM : out  STD_LOGIC;
           CARRY : out  STD_LOGIC);
end Assignment_2a;

architecture Behavioral of Assignment_2a is
begin
Process(A,B)
begin
if (A='0') then
    SUM   <= B;
    CARRY <= '0';
else
    SUM   <= not B;
    CARRY <= B;
end if;
end Process;
end Behavioral;

architecture Dataflow of Assignment_2a is
begin
    SUM   <= A xor B;
    CARRY <= A and B;
end Dataflow;

