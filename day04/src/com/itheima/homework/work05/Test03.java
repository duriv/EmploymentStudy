package com.itheima.homework.work05;

import java.util.ArrayList;
import java.util.Calendar;

/*
5.3 题目三
	请定义一个集合：List<Integer>，并循环向集合中添加1千万个数字，请计算这个循环运行的时间，并打印。
 */
public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
//        int a=0;
        long start =System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start+"毫秒");
    }
}
