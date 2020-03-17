package com.itheima.static01_var;

public class Test {
    public static void main(String[] args) {
        //为静态的classRoom赋值
        Student.classRoom = "直播间2";
          //创建第一个对象
        Student student = new Student();
        student.name = "乔峰";
       // student.classRoom = "直播间2";
        System.out.println(student.name);
       // System.out.println(student.classRoom);
        System.out.println(Student.classRoom);


        System.out.println("---------------------");

        //创建第二个对象
        Student student1 = new Student();
        student1.name = "虚竹";
        //student1.classRoom = "直播间2";
        System.out.println(student1.name);
        System.out.println(Student.classRoom);//类名直接调用
    }
}
