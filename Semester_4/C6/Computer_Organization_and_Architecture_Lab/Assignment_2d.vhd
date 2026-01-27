----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    05:39:21 01/21/2026 
-- Design Name: 
-- Module Name:    Assignment_2d - Behavioral 
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

entity Assignment_2d is
    Port ( A      : in  STD_LOGIC;
           B      : in  STD_LOGIC;
           C      : in  STD_LOGIC;
           DIFF   : out STD_LOGIC;
           BORROW : out STD_LOGIC);
end Assignment_2d;

architecture Behavioral of Assignment_2d is
begin
Process(A,B,C)
begin
if (A='0') then
    if (B='0') then
        DIFF   <= C;
        BORROW <= C;
    else
        DIFF   <= not C;
        BORROW <= '1';
    end if;
else
    if (B='0') then
        DIFF   <= not C;
        BORROW <= '0';
    else
        DIFF   <= C;
        BORROW <= C;
    end if;
end if;
end Process;
end Behavioral;

architecture Dataflow of Assignment_2d is
begin
    DIFF   <= A xor B xor C;
    BORROW <= ((not A) and B) or ((not A) and C) or (B and C);
end Dataflow;


