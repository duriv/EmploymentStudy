package com.itheima.utils;



import com.itheima.domain.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Utils {
    public static int stuId ;//学员ID的初始值,添加学生之后,id++
    public static int teaId ;//教师ID的初始值,添加教师之后,id++
            static {
                stuId = 0;
                teaId = 0; //
                //后期可以改为从文件/数据库读取初始值
            }
            //根据出生日期,计算年龄的!!
            public static int birthdayToAge(String birthday)  {//2020-01-01
                Date birthDate = null;
                try {
                    birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return -1;
        }
        //获取当前系统时间
        Calendar cal = Calendar.getInstance();
        //如果出生日期大于当前时间，则抛出异常
        if (cal.before(birthDate)) {
            return -1;
        }
        //取出系统当前时间的年、月、日部分
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);

        //将日期设置为出生日期

        cal.setTime(birthDate);
        //取出出生日期的年、月、日部分
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        //当前年份与出生年份相减，初步计算年龄
        int age = yearNow - yearBirth;
        //当前月份与出生日期的月份相比，如果月份小于出生月份，则年龄上减1，表示不满多少周岁
        if (monthNow <= monthBirth) {
            //如果月份相等，在比较日期，如果当前日，小于出生日，也减1，表示不满多少周岁
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;
            }else{
                age--;
            }
        }
        return age;
    }
    //打印ArrayList<? extends Person>的方法,用于查询功能,展示集合中所有的学生信息
    public static void printPersonList(ArrayList<? extends Person> personList) {
        System.out.println("************************************************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t\t\t生日\t\t\t\t\t年龄\t\t描述");
        for (int i = 0; i < personList.size(); i++) {
            Person p = personList.get(i);
            System.out.println(p);
        }
        System.out.println("************************************************************************************");
    }
    //打印Person的方法,用于修改以及删除功能的,单独展示一条学生信息
    public static void printPerson(Person person) {
        System.out.println("************************************************************************************");
        System.out.println("编号\t\t\t\t\t\t\t\t姓名\t\t性别\t\t\t\t生日\t\t\t\t\t\t\t\t\t年龄\t\t描述");
        System.out.println(person);
        System.out.println("************************************************************************************");
    }
}
