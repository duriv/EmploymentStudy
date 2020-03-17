package com.itheima.homework.work03;

import java.time.YearMonth;
import java.util.Calendar;

/*
3.2 题目二
	请编程，计算并打印“1949年10月1日”那天是星期几？
 */
//DAY_OF_WEEK:周中的天(周几  国外周日算第一天)
public class Test02 {
    public static void main(String[] args) {
        Calendar date =Calendar.getInstance();
        date.set(1949,10-1,1);//六

        System.out.println(date.get(Calendar.YEAR));
        System.out.println(date.get(Calendar.MONTH)+1);
        System.out.println(date.get(Calendar.DAY_OF_MONTH));
        System.out.print("1949年10月1日那天是星期");
        System.out.print(date.get(Calendar.DAY_OF_WEEK)-1);


    }
}
