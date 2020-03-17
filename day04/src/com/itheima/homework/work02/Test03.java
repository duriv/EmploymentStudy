package com.itheima.homework.work02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
2.3 题目三
	请在控制台以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印当前系统时间。
 */
public class Test03 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String format=sdf.format(date);
        System.out.println(format);
    }
}
