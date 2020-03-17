package com.itheima.c_var;
/*
   可变参数:
     1.使用场景:方法的参数,只确定参数的类型,不确定参数的个数
     2.本质:数组
     3.定义格式:数据类型...变量名

     4.注意:
        a.一个方法中只能定义一个可变参数
        b.参数位置可变参数可以和普通的参数同时出现,但是可变参数要放在最后

 */
public class Test01 {
    public static void main(String[] args) {
       // method(1,2,3,4,5,6,7);
        method("哈哈",1,2,3,4,5);
    }

    //定义一个带有可变参数的方法
    public static void method(String s,int...arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+s);
        }
    }
}
