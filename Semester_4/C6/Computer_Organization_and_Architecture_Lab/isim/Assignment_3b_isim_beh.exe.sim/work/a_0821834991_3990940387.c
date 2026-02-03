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
static const char *ng0 = "/home/debarghaya/Documents/GitHub/IEM-Assignments/Semester_4/C6/Computer_Organization_and_Architecture_Lab/Assignment_3b.vhd";
extern char *IEEE_P_1242562249;

char *ieee_p_1242562249_sub_17126692536656888728_1035706684(char *, char *, int , int );
char *ieee_p_1242562249_sub_2423793367844140314_1035706684(char *, char *, char *, char *, int );
char *ieee_p_1242562249_sub_3525738511873258197_1035706684(char *, char *, char *, char *, char *, char *);


static void work_a_0821834991_3990940387_p_0(char *t0)
{
    char t5[16];
    char t12[16];
    char *t1;
    char *t2;
    unsigned char t3;
    unsigned char t4;
    unsigned char t6;
    char *t7;
    char *t8;
    char *t9;
    char *t10;
    char *t11;
    char *t13;
    char *t14;
    unsigned int t15;
    unsigned char t16;
    char *t17;
    char *t18;
    char *t19;
    char *t20;
    char *t21;
    char *t22;

LAB0:    xsi_set_current_line(41, ng0);
    t1 = (t0 + 1352U);
    t2 = *((char **)t1);
    t3 = *((unsigned char *)t2);
    t4 = (t3 == (unsigned char)3);
    if (t4 != 0)
        goto LAB3;

LAB4:
LAB7:    t13 = ieee_p_1242562249_sub_17126692536656888728_1035706684(IEEE_P_1242562249, t12, 0, 9);
    t14 = (t12 + 12U);
    t15 = *((unsigned int *)t14);
    t15 = (t15 * 1U);
    t16 = (9U != t15);
    if (t16 == 1)
        goto LAB9;

LAB10:    t17 = (t0 + 4336);
    t18 = (t17 + 56U);
    t19 = *((char **)t18);
    t20 = (t19 + 56U);
    t21 = *((char **)t20);
    memcpy(t21, t13, 9U);
    xsi_driver_first_trans_fast(t17);

LAB2:    t22 = (t0 + 4208);
    *((int *)t22) = 1;

LAB1:    return;
LAB3:    t1 = ieee_p_1242562249_sub_17126692536656888728_1035706684(IEEE_P_1242562249, t5, 1, 9);
    t6 = (9U != 9U);
    if (t6 == 1)
        goto LAB5;

LAB6:    t7 = (t0 + 4336);
    t8 = (t7 + 56U);
    t9 = *((char **)t8);
    t10 = (t9 + 56U);
    t11 = *((char **)t10);
    memcpy(t11, t1, 9U);
    xsi_driver_first_trans_fast(t7);
    goto LAB2;

LAB5:    xsi_size_not_matching(9U, 9U, 0);
    goto LAB6;

LAB8:    goto LAB2;

LAB9:    xsi_size_not_matching(9U, t15, 0);
    goto LAB10;

}

static void work_a_0821834991_3990940387_p_1(char *t0)
{
    char t1[16];
    char t2[16];
    char t3[16];
    char t7[16];
    char *t4;
    char *t5;
    char *t6;
    char *t8;
    char *t9;
    char *t10;
    char *t11;
    char *t12;
    char *t13;
    char *t14;
    char *t15;
    unsigned int t16;
    unsigned int t17;
    unsigned char t18;
    char *t19;
    char *t20;
    char *t21;
    char *t22;
    char *t23;
    char *t24;

LAB0:    xsi_set_current_line(43, ng0);

LAB3:    t4 = (t0 + 1032U);
    t5 = *((char **)t4);
    t4 = (t0 + 7448U);
    t6 = ieee_p_1242562249_sub_2423793367844140314_1035706684(IEEE_P_1242562249, t3, t5, t4, 9);
    t8 = (t0 + 1192U);
    t9 = *((char **)t8);
    t8 = (t0 + 7464U);
    t10 = ieee_p_1242562249_sub_2423793367844140314_1035706684(IEEE_P_1242562249, t7, t9, t8, 9);
    t11 = ieee_p_1242562249_sub_3525738511873258197_1035706684(IEEE_P_1242562249, t2, t6, t3, t10, t7);
    t12 = (t0 + 1992U);
    t13 = *((char **)t12);
    t12 = (t0 + 7512U);
    t14 = ieee_p_1242562249_sub_3525738511873258197_1035706684(IEEE_P_1242562249, t1, t11, t2, t13, t12);
    t15 = (t1 + 12U);
    t16 = *((unsigned int *)t15);
    t17 = (1U * t16);
    t18 = (9U != t17);
    if (t18 == 1)
        goto LAB5;

LAB6:    t19 = (t0 + 4400);
    t20 = (t19 + 56U);
    t21 = *((char **)t20);
    t22 = (t21 + 56U);
    t23 = *((char **)t22);
    memcpy(t23, t14, 9U);
    xsi_driver_first_trans_fast(t19);

LAB2:    t24 = (t0 + 4224);
    *((int *)t24) = 1;

LAB1:    return;
LAB4:    goto LAB2;

LAB5:    xsi_size_not_matching(9U, t17, 0);
    goto LAB6;

}

static void work_a_0821834991_3990940387_p_2(char *t0)
{
    char *t1;
    char *t2;
    unsigned int t3;
    unsigned int t4;
    unsigned int t5;
    char *t6;
    char *t7;
    char *t8;
    char *t9;
    char *t10;
    char *t11;

LAB0:    xsi_set_current_line(47, ng0);

LAB3:    t1 = (t0 + 1832U);
    t2 = *((char **)t1);
    t3 = (8 - 7);
    t4 = (t3 * 1U);
    t5 = (0 + t4);
    t1 = (t2 + t5);
    t6 = (t0 + 4464);
    t7 = (t6 + 56U);
    t8 = *((char **)t7);
    t9 = (t8 + 56U);
    t10 = *((char **)t9);
    memcpy(t10, t1, 8U);
    xsi_driver_first_trans_fast_port(t6);

LAB2:    t11 = (t0 + 4240);
    *((int *)t11) = 1;

LAB1:    return;
LAB4:    goto LAB2;

}

static void work_a_0821834991_3990940387_p_3(char *t0)
{
    char *t1;
    char *t2;
    int t3;
    unsigned int t4;
    unsigned int t5;
    unsigned int t6;
    unsigned char t7;
    char *t8;
    char *t9;
    char *t10;
    char *t11;
    char *t12;
    char *t13;

LAB0:    xsi_set_current_line(48, ng0);

LAB3:    t1 = (t0 + 1832U);
    t2 = *((char **)t1);
    t3 = (8 - 8);
    t4 = (t3 * -1);
    t5 = (1U * t4);
    t6 = (0 + t5);
    t1 = (t2 + t6);
    t7 = *((unsigned char *)t1);
    t8 = (t0 + 4528);
    t9 = (t8 + 56U);
    t10 = *((char **)t9);
    t11 = (t10 + 56U);
    t12 = *((char **)t11);
    *((unsigned char *)t12) = t7;
    xsi_driver_first_trans_fast_port(t8);

LAB2:    t13 = (t0 + 4256);
    *((int *)t13) = 1;

LAB1:    return;
LAB4:    goto LAB2;

}


extern void work_a_0821834991_3990940387_init()
{
	static char *pe[] = {(void *)work_a_0821834991_3990940387_p_0,(void *)work_a_0821834991_3990940387_p_1,(void *)work_a_0821834991_3990940387_p_2,(void *)work_a_0821834991_3990940387_p_3};
	xsi_register_didat("work_a_0821834991_3990940387", "isim/Assignment_3b_isim_beh.exe.sim/work/a_0821834991_3990940387.didat");
	xsi_register_executes(pe);
}
