----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    05:30:27 01/21/2026 
-- Design Name: 
-- Module Name:    Assignment_2b - Behavioral 
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

entity Assignment_2b is
    Port ( A : in  STD_LOGIC;
           B : in  STD_LOGIC;
           DIFF : out  STD_LOGIC;
           BORROW : out  STD_LOGIC);
end Assignment_2b;

architecture Behavioral of Assignment_2b is
begin
Process(A,B)
begin
if (A='0') then
    DIFF   <= B;
    BORROW <= B;
else
    DIFF   <= not B;
    BORROW <= '0';
end if;
end Process;
end Behavioral;

architecture Dataflow of Assignment_2b is
begin
    DIFF   <= A xor B;
    BORROW <= (not A) and B;
end Dataflow;



