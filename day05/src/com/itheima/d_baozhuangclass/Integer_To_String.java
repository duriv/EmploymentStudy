package com.itheima.d_baozhuangclass;
/*
   任何类型遇到字符串都会变成字符串

   基本数据类型和字符串之间的转换

   1.基本数据类型转成String
      a.基本数据类型直接和""拼接
      b.通过String类中的静态方法
         static String valueOf(int i)


    2.将String转成基本数据类型:  parsexxx->xxx代表的是具体的基本数据类型（只是为了好记）
       - `public static byte parseByte(String s)`：将字符串参数转换为对应的byte基本类型。
       - `public static short parseShort(String s)`：将字符串参数转换为对应的short基本类型。
       - `public static int parseInt(String s)`：将字符串参数转换为对应的int基本类型。**
       - `public static long parseLong(String s)`：将字符串参数转换为对应的long基本类型。**
       - `public static float parseFloat(String s)`：将字符串参数转换为对应的float基本类型。
       - `public static double parseDouble(String s)`：将字符串参数转换为对应的double基本类型。
       - `public static boolean parseBoolean(String s)`：将字符串参数转换为对应的boolean基本类型。

 */
public class Integer_To_String {
    public static void main(String[] args) {
        method01();//基本数据类型转成字符串
        method02();//将字符串转成基本数据类型
    }

    private static void method02() {
        int i = Integer.parseInt("111");
        System.out.println(i+1);

        double v = Double.parseDouble("2.5");
        System.out.println(v+1);
    }

    private static void method01() {
        int i = 10;
        String s = i+"";
        System.out.println(s+1);//101
        System.out.println("------------");
        String value = String.valueOf(i);
        System.out.println(value);
    }
}
