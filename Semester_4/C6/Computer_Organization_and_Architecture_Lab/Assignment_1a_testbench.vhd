--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   00:55:26 01/21/2026
-- Design Name:   
-- Module Name:   /home/debarghaya/Documents/GitHub/IEM-Assignments/Semester 4/C6/Computer_Organization_and_Architecture_Lab/Assignment_1a_testbench.vhd
-- Project Name:  Computer_Organization_and_Architecture_Lab
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: Assignment_1a
-- 
-- Dependencies:
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
--
-- Notes: 
-- This testbench has been automatically generated using types std_logic and
-- std_logic_vector for the ports of the unit under test.  Xilinx recommends
-- that these types always be used for the top-level I/O of a design in order
-- to guarantee that the testbench will bind correctly to the post-implementation 
-- simulation model.
--------------------------------------------------------------------------------
LIBRARY ieee;
USE ieee.std_logic_1164.ALL;
 
-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--USE ieee.numeric_std.ALL;
 
ENTITY Assignment_1a_testbench IS
END Assignment_1a_testbench;

architecture Behavioral of Assignment_1a_testbench is
    signal a, b : STD_LOGIC := '0';
    signal c    : STD_LOGIC;
begin
    uut: entity work.Assignment_1a
        port map (
            a => a,
            b => b,
            c => c
        );

    process
    begin
        -- 0 to 100 ns
        a <= '0'; 
        b <= '0'; 
        wait for 100 ns;

        -- 100 to 200 ns
        a <= '1'; 
        b <= '0'; 
        wait for 100 ns;

        -- 200 to 300 ns
        a <= '0'; 
        b <= '1'; 
        wait for 100 ns;

        -- 300 to 400 ns
        a <= '1'; 
        b <= '1'; 
        wait for 100 ns;

        wait;
    end process;
end Behavioral;
