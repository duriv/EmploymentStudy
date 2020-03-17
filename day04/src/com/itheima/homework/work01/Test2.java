package com.itheima.homework.work01;
/*
1.2 题目二
	请按标准格式定义一个“学生类”，它有三个属性：姓名、性别、年龄
	请编写测试类，创建两个“学生对象”并为它们的属性赋值，并能比较两个对象的所有属性值是否完全相等。
	//重写equals，比较相等
 */
public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("小名","男",18);

        Student student2 = new Student("小花","女",18);

        Student student3 = new Student("小名","男",18);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));

    }
}
