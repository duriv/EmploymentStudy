package com.itheima.extends07;
/*
  每个类都有自己的构造方法->如果不写,java默认提供一个空参构造(我们也可以自己手动写上)

  如果我们手动写了有参构造,java将不再提供空参构造了

  总结:最好是都手动写上

  空参构造作用:new对象
  有参构造作用:new对象的时候为属性赋值
 */
public class Fu {
    public Fu(){
        System.out.println("我是父类的空参构造");
    }

    public Fu(int i){
        System.out.println("我是父类中的有参构造"+i);
    }

    public void method(){
        System.out.println("我是父类中的method方法");
    }
}
