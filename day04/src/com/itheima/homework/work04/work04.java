package com.itheima.homework.work04;
/*
四 编程题【Math类】
4.1 题目一
	请编程进行以下运算：
	请计算3的5次幂
	请计算3.2向上取整的结果
	请计算3.8向下取整的结果
	请计算5.6四舍五入取整的结果

 */
public class work04 {
    public static void main(String[] args) {

//	请计算3的5次幂
        System.out.println("3的5次幂="+(int)Math.pow(3,5));
//	请计算3.2向上取整的结果
        System.out.println("3.2向上取整的结果="+(int)Math.ceil(3.3));
//	请计算3.8向下取整的结果
        System.out.println("3.8向下取整的结果="+(int)Math.floor(3.8));
//	请计算5.6四舍五入取整的结果
        System.out.println("5.6四舍五入取整的结果="+Math.round(5.6));
    }
}
