package com.itheima.abstract05;
//快速利用子类的构造方法为父类中的私有成员赋值->利用快键键生成子类的构造
public class WangWei extends WeiHu{
    public WangWei(){

    }

    public WangWei(int id,String name){
        super(id,name);//调用维护类的有参构造
    }

    @Override
    public void work() {
        System.out.println("员工号为:"+getId()+"的"+getName()+"员工,安网线");
    }
}
