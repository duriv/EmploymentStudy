package com.itheima.homework.work03;
//4.	请定义”UI讲师类”，继承自“员工类”，并实现“绘画”接口。
public class UiTeacher extends Staff implements Drawing {
    //	行为：工作(抽象)
    public void work(String name,String age , String sex){
        System.out.println("姓名"+name+"年龄"+age+"性别"+sex+"努力工作");
    }

    @Override
    public void draw() {
        System.out.println("调用画画的接口");
    }
}
