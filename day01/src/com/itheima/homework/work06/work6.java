package com.itheima.homework.work06;
/*
	六 编程题【模板设计模式】
6.1 题目：
	某公司的系统中需要记录两类员工：
	员工类：
	属性：工号、姓名、年龄
	行为：发布通知
	经理类：
	属性：工号、姓名、年龄、年终奖额
	行为：发布通知
	任何员工发布“通知”都统一使用以下格式：
	通知：
		xxxxxxxxx
		xxxxxxxxx
			必胜环球科技有限公司
6.2 要求：
	请按需求为这两个类定义一个父类，并使用“模板”发布通知。
 */
public class work6 {
    public static void main(String[] args) {
        yuangong ygs = new yuangong();
        ygs.TongZhi();
        ygs.huhu(001,"小名",19);

        jingli jl = new jingli();
        jl.TongZhi();
        jl.huhu(002,"小w",16);

    }
}
//人类
 class Person1{
    private int Id;
    private String Name;
    private int age;

    public Person1() {
    }

    public Person1(int id, String name, int age) {
        Id = id;
        Name = name;
        this.age = age;
    }
    //属性
    public void huhu(int id, String name, int age){
        System.out.println("工号为"+id+"姓名为"+name+"年龄为"+age);
    }
    //发布通知
    public void TongZhi(){
        System.out.println("\t通知：\n" +
                "\t\txxxxxxxxx\n" +
                "\t\txxxxxxxxx\n" +
                "\t\t\t必胜环球科技有限公司");
    }
}
//	员工类：
class yuangong extends Person1{
    //属性
    public void huhu(int id, String name, int age){
        System.out.println("工号为"+id+"姓名为"+name+"年龄为"+age);
    }
    //发布通知
    public void TongZhi(){
        System.out.println("\t通知：\n" +
                "\t\txxxxxxxxx\n" +
                "\t\txxxxxxxxx\n" +
                "\t\t\t必胜环球科技有限公司");
    }
}
//	经理类：
class jingli extends Person1{
    //属性
    public void huhu(int id, String name, int age){
        System.out.println("工号为"+id+"姓名为"+name+"年龄为"+age);
    }
    //发布通知
    public void TongZhi(){
        System.out.println("\t通知：\n" +
                "\t\txxxxxxxxx\n" +
                "\t\txxxxxxxxx\n" +
                "\t\t\t必胜环球科技有限公司");
    }
}