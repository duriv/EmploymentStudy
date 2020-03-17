package com.itheima.homework.work05;
/*
五 编程题【抽象类】
5.1 题目：
	我们计划为一所体育学校设计一套系统，需要记录以下人员的信息：
	教练员：
		属性：员工编号、姓名、性别、年龄
		行为：吃饭(吃工作餐)
	运动员：
		属性：学员编号、姓名、性别、年龄、所在班级
		行为：吃饭(吃营养餐)
5.2 要求：
	请根据需求，设计、并编码实现：父类“人员类”，子类“教练员类”、子类“运动员类”，
	并包含共有的属性和行为的定义，由于运动员和教练员的吃饭的内容不同，所以需要设计为“抽象方法”。
 */
public class Test {
    public static void main(String[] args) {
    //子类“教练员类
        JiaoLianYuan jly = new JiaoLianYuan();
        jly.eat();
        jly.ShuXin(001,"xiaoxiao","男",18);

        // 子类“运动员类”
        YunDongYuan ydy = new YunDongYuan();
        ydy.eat();
        ydy.ShuXin(002,"xixi","女",19,"12");

    }
}
//父类“人员类”
abstract class  Ren{
    private int BianHao;
    private String Name;
    private String Sex;
    private int age;

    public Ren() {
    }

    public Ren(int bianHao, String name, String sex, int age) {
        BianHao = bianHao;
        Name = name;
        Sex = sex;
        this.age = age;
    }
    //属性
    public void ShuXin(int bianHao, String name, String sex, int age){
        System.out.println("编号"+bianHao+"姓名"+ name+"性别"+sex+"年龄"+age);
    }
    //吃饭
    public abstract void eat();
}
//子类“教练员类”
class JiaoLianYuan extends Ren{
    public JiaoLianYuan() {
    }

    public JiaoLianYuan(int bianHao, String name, String sex, int age) {
        super(bianHao, name, sex, age);
    }
    //属性
    public  void ShuXin(int bianHao, String name, String sex, int age){
        System.out.println("教练员编号"+bianHao+"姓名"+ name+"性别"+sex+"年龄"+age);
    }
    @Override
    public void eat() {
        System.out.println("吃饭(吃工作餐)");
    }
}
// 子类“运动员类”
class YunDongYuan extends Ren{
    private String BanJi;

    public YunDongYuan(String banJi) {
        BanJi = banJi;
    }

    public YunDongYuan(int bianHao, String name, String sex, int age, String banJi) {
        super(bianHao, name, sex, age);
        BanJi = banJi;
    }

    public YunDongYuan() {

    }

    //属性
    public void ShuXin(int bianHao, String name, String sex, int age,String banJi){
        System.out.println("运动员类编号"+bianHao+"姓名"+ name+"性别"+sex+"年龄"+age+"班级"+banJi);
    }
    @Override
    public void eat() {
         System.out.println("吃饭(吃营养餐)");
    }
}