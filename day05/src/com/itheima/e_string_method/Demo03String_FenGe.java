package com.itheima.e_string_method;

import java.util.Arrays;

/*
   分割功能:
      String[] split(String regex) ->将字符串按照给定的regex(规则)拆分成字符串数组
 */
public class Demo03String_FenGe {
    public static void main(String[] args) {
        String s = "367,java";
        String[] split = s.split(",");
        System.out.println(Arrays.toString(split));

        System.out.println("---------------");
        String s1 = "367.java";
        String[] split1 = s1.split("\\.");
        System.out.println(Arrays.toString(split1));
    }
}
