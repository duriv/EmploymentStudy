package com.itheima.extends07;
/*
   构造方法中第一行默认有一个:super()->代表的是父类空参构造
                         不写也有

   注意:
     一个构造中不能连续出现两个super
     super(参数)想使用必须手动写上

   super访问父类成员方式
       调用父类中的成员变量-->在子类中 super.成员变量名
       调用父类中的成员方法-->在子类中 super.方法名(参数)
       调用父类中的构造方法-->在子类构造中  super()或者super(参数)
 */
public class Zi extends Fu{
    public Zi(){
        super();
        System.out.println("我是子类空参构造");
    }
    public Zi(int i){
        super(i);//调用父类有参构造
        System.out.println("我是子类空参构造111");
    }


    public void method(){
        super.method();//父类中的method方法
    }
}
