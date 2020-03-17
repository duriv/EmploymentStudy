package com.itheima.homework.work05;


/*
5.4 题目四
	程序模拟一个论坛发帖的过程，请用户输入一个发帖内容，例如：
		“积分看电视普京了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记普京”
	请定义一个关键字数组：
		String[] keyArray = {“特朗普”,”普京”};
	请将字符串中包含的数组中的关键字替换为*符号。

 */
public class Test04 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个发帖内容:");
//        String tie1 =sc.nextLine();
        String[] keyArray = {"特朗普","普京"};
        String tie ="积分看电视普京了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记普京";
        System.out.println("将字符串中包含的数组中的关键字替换为*符号。");
        System.out.println("积分看电视普京了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记普京");
//        String a = null;
        String b = null;
        for (int i = 0; i < keyArray.length; i++) {
//            a= tie.replace(keyArray[0],"*");
            String key=keyArray[i];
             b=tie.replace(key,"*");
        }
//        System.out.println(a);
        System.out.println(b);
    }
}
