package com.itheima.h_system;
/*
   拼接5W次字符串,计算这段代码执行了多长时间
 */
public class System02 {
    public static void main(String[] args) {
        //计算String拼接5W次字符串效率
        //stringAddTime();

        //计算StringBuilder拼接5W次字符串效率
        stringBuilderAddTime();
    }

    private static void stringBuilderAddTime() {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
          sb.append(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("耗时:"+(end-start)+"毫秒");
    }

    private static void stringAddTime() {
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 50000; i++) {
            s+=i;
        }

        long end = System.currentTimeMillis();

        System.out.println("耗时:"+(end-start)+"毫秒");
    }
}
