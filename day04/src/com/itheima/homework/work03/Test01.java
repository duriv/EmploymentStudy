package com.itheima.homework.work03;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;

/*
三 编程题【Calendar类】
3.1 题目一
	请编写程序，使用Calendar类获取日历对象，并分别获取年、月、日、小时、分、秒，并将它们打印到控制台。


 */
public class Test01 {
    public static void main(String[] args) {
//        Calendar date=Calendar.getInstance();
//        System.out.println(date.getTime());
/*
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

*/
        /*
            Year  年
            MONTH 月(从0开始,如果想对应国内的月份,可以+1)
            DAY_OF_MONTH:   月中的天(几号)
            HOUR:时 (12小时制)
            HOUR_OF_DAY 时(24小时制)
            MINUTE:分
            SECOND:秒
            DAY_OF_WEEK:周中的天(周几  国外周日算第一天)
         */
        Calendar date=Calendar.getInstance();
        date.add(Calendar.MONTH,1);
//        System.out.println(date.getTime());
//        分别获取年、月、日、小时、分、秒，并将它们打印到控制台。
        System.out.println("年："+date.get(Calendar.YEAR));
        System.out.println("月："+date.get(Calendar.MONTH));
        System.out.println("日："+date.get(Calendar.DAY_OF_MONTH));
        System.out.println("时："+date.get(Calendar.HOUR_OF_DAY));
        System.out.println("分："+date.get(Calendar.MINUTE));
        System.out.println("秒："+date.get(Calendar.SECOND));

//        System.out.println(date.get(date.DAY_OF_MONTH));
    }
}
