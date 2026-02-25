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
static const char *ng0 = "/home/debarghaya/Documents/GitHub/IEM-Assignments/Semester_4/C6/Computer_Organization_and_Architecture_Lab/Assignment_5a_testbench.vhd";
extern char *IEEE_P_1242562249;

char *ieee_p_1242562249_sub_10420449594411817395_1035706684(char *, char *, int , int );


static void work_a_3213084301_3212880686_p_0(char *t0)
{
    char t6[16];
    char *t1;
    char *t2;
    char *t3;
    int t4;
    int t5;
    char *t7;
    char *t8;
    char *t9;
    char *t10;
    char *t11;
    char *t12;
    char *t13;
    int64 t14;
    int t15;

LAB0:    t1 = (t0 + 2824U);
    t2 = *((char **)t1);
    if (t2 == 0)
        goto LAB2;

LAB3:    goto *t2;

LAB2:    xsi_set_current_line(44, ng0);
    t2 = (t0 + 5875);
    *((int *)t2) = 2;
    t3 = (t0 + 5879);
    *((int *)t3) = 4;
    t4 = 2;
    t5 = 4;

LAB4:    if (t4 <= t5)
        goto LAB5;

LAB7:    xsi_set_current_line(50, ng0);

LAB15:    *((char **)t1) = &&LAB16;

LAB1:    return;
LAB5:    xsi_set_current_line(45, ng0);
    t7 = (t0 + 5875);
    t8 = ieee_p_1242562249_sub_10420449594411817395_1035706684(IEEE_P_1242562249, t6, *((int *)t7), 4);
    t9 = (t0 + 3208);
    t10 = (t9 + 56U);
    t11 = *((char **)t10);
    t12 = (t11 + 56U);
    t13 = *((char **)t12);
    memcpy(t13, t8, 4U);
    xsi_driver_first_trans_fast(t9);
    xsi_set_current_line(46, ng0);
    t2 = ieee_p_1242562249_sub_10420449594411817395_1035706684(IEEE_P_1242562249, t6, 3, 4);
    t3 = (t0 + 3272);
    t7 = (t3 + 56U);
    t8 = *((char **)t7);
    t9 = (t8 + 56U);
    t10 = *((char **)t9);
    memcpy(t10, t2, 4U);
    xsi_driver_first_trans_fast(t3);
    xsi_set_current_line(47, ng0);
    t14 = (200 * 1000LL);
    t2 = (t0 + 2632);
    xsi_process_wait(t2, t14);

LAB10:    *((char **)t1) = &&LAB11;
    goto LAB1;

LAB6:    t2 = (t0 + 5875);
    t4 = *((int *)t2);
    t3 = (t0 + 5879);
    t5 = *((int *)t3);
    if (t4 == t5)
        goto LAB7;

LAB12:    t15 = (t4 + 1);
    t4 = t15;
    t7 = (t0 + 5875);
    *((int *)t7) = t4;
    goto LAB4;

LAB8:    goto LAB6;

LAB9:    goto LAB8;

LAB11:    goto LAB9;

LAB13:    goto LAB2;

LAB14:    goto LAB13;

LAB16:    goto LAB14;

}


extern void work_a_3213084301_3212880686_init()
{
	static char *pe[] = {(void *)work_a_3213084301_3212880686_p_0};
	xsi_register_didat("work_a_3213084301_3212880686", "isim/Assignment_5a_testbench_isim_beh.exe.sim/work/a_3213084301_3212880686.didat");
	xsi_register_executes(pe);
}
