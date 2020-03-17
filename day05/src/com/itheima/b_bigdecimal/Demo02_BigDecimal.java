package com.itheima.b_bigdecimal;

import java.math.BigDecimal;

/*
   除法
      BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
      可以将除出来的结果,按照指定的规则省略小数或者向前进1,直接舍去,四舍五入

      divisor:BigDecimal对象
      scale:保留的位数
      roundingMode:舍入方式

      舍入方式:BigDecimal类提供了静态的成员变量来表示舍入方式
         static int ROUND_UP :向前进1
         static int ROUND_DOWN :直接舍去
         static int ROUND_HALF_UP :四舍五入
 */
public class Demo02_BigDecimal {
    public static void main(String[] args) {
        System.out.println(3.125/1.582);

        //利用BigDecimal做除法
        BigDecimal b1 = new BigDecimal("3.125");
        BigDecimal b2 = new BigDecimal("1.582");
        BigDecimal divide = b1.divide(b2,2,BigDecimal.ROUND_UP);
        //BigDecimal divide = b1.divide(b2,2,BigDecimal.ROUND_DOWN);
        //BigDecimal divide = b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(divide);
    }
}
