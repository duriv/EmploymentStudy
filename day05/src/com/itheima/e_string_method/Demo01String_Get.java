package com.itheima.e_string_method;
/*
   基础班String学的方法:
       toCharArray()->将字符串转成char数组
       charAt(int index)->根据索引拿字符
       length()->获取字符串长度

   String的获取方法
       String concat(String str) ->将指定的字符串连接到字符串的末尾,返回一个新串
       int indexOf(String str) ->获取我们指定的字符串在原串中第一次出现的所以位置
       String substring(int beginIndex)->返回一个子串,从beginIndex开始截取字符串到结尾
       String substring(int beginIndex, int endIndex)->返回一个子串,从beginIndex到endIndex截取字符串
                                                       包含beginIndex,不包含endIndex->含头儿不含尾

 */
public class Demo01String_Get {
    public static void main(String[] args) {
        String s = "abc";
        //String concat(String str) ->将指定的字符串连接到字符串的末尾,返回一个新串
        String hahah = s.concat("hahah");
        System.out.println(hahah);
        System.out.println("-------------");
        //int indexOf(String str) ->获取我们指定的字符串在原串中第一次出现的所以位置
        int i = s.indexOf("a");
        System.out.println(i);

        System.out.println("-------------------------");

        String s1 = "abcdefg";
        // String substring(int beginIndex)->返回一个子串,从beginIndex开始截取字符串到结尾
        String substring = s1.substring(1);
        System.out.println(substring);

        //String substring(int beginIndex, int endIndex)->返回一个子串,从beginIndex到endIndex截取字符串

        String substring1 = s1.substring(1, 4);
        System.out.println(substring1);
    }
}
