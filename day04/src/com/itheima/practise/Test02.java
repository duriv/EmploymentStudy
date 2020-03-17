package com.itheima.practise;

import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        // 时间Date
//        System.out.println(new Date());
//        System.out.println(new Date(0L));

        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        //整数运算结果还是整数。所以加一个1.0为了计算出来有小数，更精确
        System.out.println(time*1.0/1000/60/60/24/365);
        System.out.println(date.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
    }
}
