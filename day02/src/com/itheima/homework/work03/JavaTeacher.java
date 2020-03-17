package com.itheima.homework.work03;
/*
3.	请定义“Java讲师类”继承自“员工类”
 */
public class JavaTeacher extends Staff  {
    //	行为：工作(抽象)
    public void work(String name,String age , String sex){
        System.out.println("姓名"+name+"年龄"+age+"性别"+sex+"努力工作");
    }
}
