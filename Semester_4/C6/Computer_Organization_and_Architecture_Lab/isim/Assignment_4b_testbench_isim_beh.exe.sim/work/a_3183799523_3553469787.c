/**********************************************************************/
/*   ____  ____                                                       */
/*  /   /\/   /                                                       */
/* /___/  \  /                                                        */
/* \   \   \/                                                       */
/*  \   \        Copyright (c) 2003-2009 Xilinx, Inc.                */
/*  /   /          All Right Reserved.                                 */
/* /---/   /\                                                         */
/* \   \  /  \                                                      */
/*  \___\/\___\                                                    */
/***********************************************************************/

/* This file is designed for use with ISim build 0xfbc00daa */

#define XSI_HIDE_SYMBOL_SPEC true
#include "xsi.h"
#include <memory.h>
#ifdef __GNUC__
#include <stdlib.h>
#else
#include <malloc.h>
#define alloca _alloca
#endif
static const char *ng0 = "/home/debarghaya/Documents/GitHub/IEM-Assignments/Semester_4/C6/Computer_Organization_and_Architecture_Lab/Assignment_4b_testbench.vhd";



static void work_a_3183799523_3553469787_p_0(char *t0)
{
    char *t1;
    char *t2;
    char *t3;
    int t4;
    int t5;
    char *t6;
    char *t7;
    int t8;
    int t9;
    unsigned int t10;
    unsigned int t11;
    unsigned int t12;
    char *t13;
    char *t14;
    char *t15;
    char *t16;
    char *t17;
    char *t18;
    int64 t19;

LAB0:    t1 = (t0 + 2464U);
    t2 = *((char **)t1);
    if (t2 == 0)
        goto LAB2;

LAB3:    goto *t2;

LAB2:    xsi_set_current_line(36, ng0);
    t2 = (t0 + 5624);
    *((int *)t2) = 0;
    t3 = (t0 + 5628);
    *((int *)t3) = 15;
    t4 = 0;
    t5 = 15;

LAB4:    if (t4 <= t5)
        goto LAB5;

LAB7:    xsi_set_current_line(40, ng0);

LAB15:    *((char **)t1) = &&LAB16;

LAB1:    return;
LAB5:    xsi_set_current_line(37, ng0);
    t6 = (t0 + 1488U);
    t7 = *((char **)t6);
    t6 = (t0 + 5624);
    t8 = *((int *)t6);
    t9 = (t8 - 0);
    t10 = (t9 * 1);
    xsi_vhdl_check_range_of_index(0, 15, 1, *((int *)t6));
    t11 = (4U * t10);
    t12 = (0 + t11);
    t13 = (t7 + t12);
    t14 = (t0 + 2848);
    t15 = (t14 + 56U);
    t16 = *((char **)t15);
    t17 = (t16 + 56U);
    t18 = *((char **)t17);
    memcpy(t18, t13, 4U);
    xsi_driver_first_trans_fast(t14);
    xsi_set_current_line(38, ng0);
    t19 = (62.500000000000000 * 1000LL);
    t2 = (t0 + 2272);
    xsi_process_wait(t2, t19);

LAB10:    *((char **)t1) = &&LAB11;
    goto LAB1;

LAB6:    t2 = (t0 + 5624);
    t4 = *((int *)t2);
    t3 = (t0 + 5628);
    t5 = *((int *)t3);
    if (t4 == t5)
        goto LAB7;

LAB12:    t8 = (t4 + 1);
    t4 = t8;
    t6 = (t0 + 5624);
    *((int *)t6) = t4;
    goto LAB4;

LAB8:    goto LAB6;

LAB9:    goto LAB8;

LAB11:    goto LAB9;

LAB13:    goto LAB2;

LAB14:    goto LAB13;

LAB16:    goto LAB14;

}


extern void work_a_3183799523_3553469787_init()
{
	static char *pe[] = {(void *)work_a_3183799523_3553469787_p_0};
	xsi_register_didat("work_a_3183799523_3553469787", "isim/Assignment_4b_testbench_isim_beh.exe.sim/work/a_3183799523_3553469787.didat");
	xsi_register_executes(pe);
}
