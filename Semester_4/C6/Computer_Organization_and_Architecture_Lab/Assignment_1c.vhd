----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    00:39:50 01/21/2026 
-- Design Name: 
-- Module Name:    Assignment_1a - Behavioral 
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

entity Assignment_1c is
	Port ( A : in STD_LOGIC; 
	B : out STD_LOGIC);
end Assignment_1c;

architecture Behavioral of Assignment_1c is

begin
	Process(A)
	begin
		if(A='0') then
			B<='1';
		else
			B<='0';
		end if;
	end Process;
end Behavioral;

architecture Dataflow of Assignment_1c is
begin
    b <= not a;
end Dataflow;