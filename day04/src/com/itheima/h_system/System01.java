package com.itheima.h_system;
/*
   System的方法:
      1.特点
          方法都是static,都是类名直接调用
      2.常用方法:
          public static void exit(int status)-> 退出jvm
             int status->写0就行了
          public static long currentTimeMillis()->获取当前系统毫秒值->可以测试代码效率
 */
public class System01 {
    public static void main(String[] args) {
        //method01_Exit();
        method02_currentTimeMillis();
    }

    private static void method02_currentTimeMillis() {
        //public static long currentTimeMillis()->获取当前系统毫秒值->可以测试代码效率
        long l = System.currentTimeMillis();
        System.out.println(l);
    }

    public static void method01_Exit() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            //break;//结束当前循环
            //return;//结束方法

            System.exit(0);//退出jvm
        }

        System.out.println("哈哈哈哈");
    }
}
