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

entity Assignment_1d is
	Port ( A : in STD_LOGIC; 
	B : in STD_LOGIC; 
	C : out STD_LOGIC);
end Assignment_1d;

architecture Behavioral of Assignment_1d is

begin
	Process(A,B)
	begin
		if(A /= B) then
			C<='1';
		else
			C<='0';
		end if;
	end Process;
end Behavioral;

architecture Dataflow of Assignment_1d is
begin
    c <= a xor b;
end Dataflow;