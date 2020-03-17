package com.itheima.practise;

public class ll {
    public static void main(String[] args) {
        timeshuzu();
        Stringb();
    }

    private static void Stringb() {
        String s="";
        long start = System.currentTimeMillis();
        StringBuilder list =new StringBuilder();
        for (int i = 0; i < 505567890; i++) {
            list.append(s);
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"毫秒");
    }

    private static void timeshuzu() {
        String s="";
        long start = System.currentTimeMillis();

        for (long i = 0; i < 505567890; i++) {
            s+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"毫秒");
    }
}
