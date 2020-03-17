package com.itheima.public_private;
/*
   一次写好几行:alt不放  鼠标往下拉

   4种权限修饰符(了解到四个权限修饰符在特定情况下,访问权限是怎样的)
                    [public]->protected->默认的(什么都不写)->[private]
     同一个类中         yes      yes        yes              yes
     同包不同类         yes      yes        yes              no
     不同包的子父类      yes      yes        no               no
     不同包非子类        yes      no         no              no

    在编码时,如果没有特殊的考虑,建议以下的使用方式
        成员变量使用private
        构造方法使用public  方便创建对象
        成员方法使用public  方便调用方法

 */
public class MyClass {
    public int num = 10;
    //定义方法
    public void method(){
        System.out.println(num);
    }
}
