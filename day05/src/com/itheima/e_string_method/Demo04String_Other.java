package com.itheima.e_string_method;
/*
    boolean equalsIgnoreCase(String anotherString)->比较String内容,但是忽略大小写
    boolean endsWith(String suffix):判断是否以指定的字符串结尾
    boolean startsWith(String prefix) :判断是否以指定的字符串开头
    String toLowerCase() :将字符串内容变成小写,返回新串
    String toUpperCase()  :将字符串内容转成大写,返回新串
    String trim() :去掉两端空格

 */
public class Demo04String_Other {
    public static void main(String[] args) {
        //boolean equalsIgnoreCase(String anotherString)->比较String内容,但是忽略大小写
        String s = "abc";
        String s1 = "ABC";
        boolean equals = s.equals(s1);//false
        boolean b = s.equalsIgnoreCase(s1);
        System.out.println(b);//true

        System.out.println("------------------");
//        boolean endsWith(String suffix):判断是否以指定的字符串结尾
        String s2 = "abcdegf";
        boolean f = s2.endsWith("egf");
        System.out.println(f);

        System.out.println("----------------------");
        //boolean startsWith(String prefix) :判断是否以指定的字符串开头
        boolean a = s2.startsWith("ab");
        System.out.println(a);

        System.out.println("---------------");
        ///String toLowerCase() :将字符串内容变成小写,返回新串
        String s3 = "ABCDEFG";
        String s4 = s3.toLowerCase();
        System.out.println(s4);

        String s5 = "一二三四";
        String s6 = s5.toLowerCase();
        System.out.println(s6);

        System.out.println("---------------------");

        //String toUpperCase()  :将字符串内容转成大写,返回新串
        String s7 = "abcdegfADAFD";
        String s8 = s7.toUpperCase();
        System.out.println(s8);

        System.out.println("----------------");
        //String trim() :去掉两端空格
        String s9 = " ab  c ";
        System.out.println(s9);
        String trim = s9.trim();
        System.out.println(trim);

        System.out.println("-----去中间空格-----");
        String replace = s9.replace(" ", "");
        System.out.println(replace);
    }
}
