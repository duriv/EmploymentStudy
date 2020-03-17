package com.itheima.homework.work01;

import java.math.BigDecimal;
import java.util.ArrayList;

/*
一 编程题【BigDecimal类】
1.2 题目二
	有以下学员信息：
		张三,男,20,79.5
		李四,女,21,80.2
		王五,男,22,77.9
		周六,男,20,55.8
		赵七,女,21,99.9
	请定义学员类，属性：姓名、性别、年龄、分数
	请编写测试类，创建5个对象，分别存储上述值，并计算5名学员的“平均分”(四舍五入到小数点后
	2位)。

 */
public class Tset02 {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList();
        Student stu1 = new Student("张三","男",20,79.5);
        Student stu2 = new Student("李四","女",21,80.2);
        Student stu3 = new Student("张三","男",20,79.5);
        Student stu4 = new Student("张三","男",20,79.5);

//        并计算5名学员的“平均分”(四舍五入到小数点后2位)。
        double sum=stu1.getGrade()+stu2.getGrade()+stu3.getGrade()+stu4.getGrade();

//        System.out.println(sum);
        BigDecimal big1 = new BigDecimal(sum);
        BigDecimal big2 = new BigDecimal(4);
        BigDecimal ave =big1.divide(big2,2,BigDecimal.ROUND_HALF_UP);
        System.out.println("平均值为："+ave);
    }
}
