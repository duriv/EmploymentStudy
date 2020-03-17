package com.itheima.homework.work01;

import java.math.BigDecimal;

/*
一 编程题【BigDecimal类】
1.1 题目一
	有以下double数组：
		double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
	请编程计算它们的总值及平均值(四舍五入保留小数点后2位)
 */
public class Test01 {
    public static void main(String[] args) {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
        answer01(arr);
    }


    private static void answer01(double[] arr) {
        //解决方案1
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        System.out.println("和为："+sum);
//        System.out.println("平均值为："+(sum/6));
        BigDecimal big1 = new BigDecimal(sum);
        BigDecimal big2 = new BigDecimal("6");
        BigDecimal ave=big1.divide(big2,2,BigDecimal.ROUND_HALF_UP);
        System.out.println("平均数为："+ave);
//      divisor:BigDecimal对象
//      scale:保留的位数
//      roundingMode:舍入方式
//
//      舍入方式:BigDecimal类提供了静态的成员变量来表示舍入方式
//         static int ROUND_UP :向前进1
//         static int ROUND_DOWN :直接舍去
//         static int ROUND_HALF_UP :四舍五入
    }
}
