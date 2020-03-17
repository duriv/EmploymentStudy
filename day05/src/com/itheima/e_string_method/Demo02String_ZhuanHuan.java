package com.itheima.e_string_method;

import java.util.Arrays;

/*
   转换功能:
      byte[] getBytes():将String转成byte数组
      String replace(CharSequence target, CharSequence replacement)  :
               将前面的字符串替换成后面的字符串
 */
public class Demo02String_ZhuanHuan {
    public static void main(String[] args) {
        String s = "abcdefg";
        //byte[] getBytes():将String转成byte数组
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

        /*
          String replace(CharSequence target, CharSequence replacement)  :
               将前面的字符串替换成后面的字符串
         */

        String replace = s.replace("c", "哈哈");
        System.out.println(replace);
    }
}
