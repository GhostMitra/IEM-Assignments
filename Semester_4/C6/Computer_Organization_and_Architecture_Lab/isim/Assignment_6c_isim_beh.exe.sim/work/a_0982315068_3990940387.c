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
static const char *ng0 = "/home/debarghaya/Documents/GitHub/IEM-Assignments/Semester_4/C6/Computer_Organization_and_Architecture_Lab/Assignment_6c.vhd";
extern char *IEEE_P_1242562249;

char *ieee_p_1242562249_sub_10420449594411817395_1035706684(char *, char *, int , int );


static void work_a_0982315068_3990940387_p_0(char *t0)
{
    char t15[16];
    char *t1;
    char *t2;
    char *t3;
    char *t4;
    int t5;
    int t6;
    int t7;
    int t8;
    unsigned int t9;
    unsigned int t10;
    unsigned int t11;
    char *t12;
    unsigned char t13;
    unsigned char t14;
    char *t16;
    char *t17;
    char *t18;
    char *t19;
    char *t20;
    unsigned int t21;

LAB0:    xsi_set_current_line(35, ng0);
    t1 = (t0 + 4955);
    t3 = (t0 + 1488U);
    t4 = *((char **)t3);
    t3 = (t4 + 0);
    memcpy(t3, t1, 3U);
    xsi_set_current_line(36, ng0);
    t1 = (t0 + 4958);
    *((int *)t1) = 7;
    t2 = (t0 + 4962);
    *((int *)t2) = 0;
    t5 = 7;
    t6 = 0;

LAB2:    if (t5 >= t6)
        goto LAB3;

LAB5:    xsi_set_current_line(41, ng0);
    t1 = (t0 + 1488U);
    t2 = *((char **)t1);
    t1 = (t0 + 2864);
    t3 = (t1 + 56U);
    t4 = *((char **)t3);
    t12 = (t4 + 56U);
    t16 = *((char **)t12);
    memcpy(t16, t2, 3U);
    xsi_driver_first_trans_fast_port(t1);
    t1 = (t0 + 2784);
    *((int *)t1) = 1;

LAB1:    return;
LAB3:    xsi_set_current_line(37, ng0);
    t3 = (t0 + 1032U);
    t4 = *((char **)t3);
    t3 = (t0 + 4958);
    t7 = *((int *)t3);
    t8 = (t7 - 7);
    t9 = (t8 * -1);
    t10 = (1U * t9);
    t11 = (0 + t10);
    t12 = (t4 + t11);
    t13 = *((unsigned char *)t12);
    t14 = (t13 == (unsigned char)3);
    if (t14 != 0)
        goto LAB6;

LAB8:
LAB7:
LAB4:    t1 = (t0 + 4958);
    t5 = *((int *)t1);
    t2 = (t0 + 4962);
    t6 = *((int *)t2);
    if (t5 == t6)
        goto LAB5;

LAB9:    t7 = (t5 + -1);
    t5 = t7;
    t3 = (t0 + 4958);
    *((int *)t3) = t5;
    goto LAB2;

LAB6:    xsi_set_current_line(38, ng0);
    t16 = (t0 + 4958);
    t17 = ieee_p_1242562249_sub_10420449594411817395_1035706684(IEEE_P_1242562249, t15, *((int *)t16), 3);
    t18 = (t0 + 1488U);
    t19 = *((char **)t18);
    t18 = (t19 + 0);
    t20 = (t15 + 12U);
    t21 = *((unsigned int *)t20);
    t21 = (t21 * 1U);
    memcpy(t18, t17, t21);
    goto LAB7;

}


extern void work_a_0982315068_3990940387_init()
{
	static char *pe[] = {(void *)work_a_0982315068_3990940387_p_0};
	xsi_register_didat("work_a_0982315068_3990940387", "isim/Assignment_6c_isim_beh.exe.sim/work/a_0982315068_3990940387.didat");
	xsi_register_executes(pe);
}
