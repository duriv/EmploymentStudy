package com.itheima.d_date;

import java.util.Date;

/*
    快速将一段代码抽取到一个方法中:ctrl+alt+M

    java.util.Date->日期类
     1.概述:表示特定的瞬间,精确到毫秒
     2.毫秒
        1秒 = 1000毫秒
     3.毫秒的作用:
         可以测试代码的效率
            System.currentTimeMills()-->获取当前系统毫秒值
     4.问题:
        从2016年1月1日   到2020年3月12日   经过了多长时间

     5.时间原点(国际基准时间)
        1970年1月1日  0时0分0秒

     6.地理知识:
         0度经线-->本初子午线

         北京在地球上的经纬度:  东经116  北纬 40度

         15度:代表是1个时区,一个小时

         我们所时区:东8区

     7.构造方法
         public Date()->将当前系统时间封装成Date对象
         public Date(long date)->将指定的毫秒值变成Date对象;[代表的是距离国际标准时间毫秒值后的那个时间]

     8.成员方法:
         public long getTime()->将日期对象转成对应的毫秒值
         public void setTime(long time)->修改当前Date对象距离标准时间的毫秒值

     9.总结:
         直接利用空参Date对象对象:获取当前系统时间
         如果给Date对象赋值(setTime,有参构造)->都是从时间原点开始算,只不过我们是东八区,我们显示出来要晚8个小时

 */
public class Demo01Date {
    public static void main(String[] args) {
        //演示Date构造方法
        //date_Constructor();

        //调用Date中的成员方法
        date_Method();
    }

    public static void date_Method() {
        //1.创建Date对象
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);

        System.out.println("---------------");

        Date date1 = new Date();
        date1.setTime(1000L);
        System.out.println(date1);


    }

    public static void date_Constructor() {
        //利用空参构造创建Date对象
        Date date = new Date();
        System.out.println(date);

        //利用有参构造创建Date对象
        Date date1 = new Date(2000L);
        System.out.println(date1);
    }
}
