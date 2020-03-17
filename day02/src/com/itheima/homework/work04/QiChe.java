package com.itheima.homework.work04;
/*
	机动车类：
		|--汽车类：
			|--奔驰车
			|--宝马车
 */
public class QiChe extends MotorVehicle {
    //	行为：运行
    public void work(String brand){
        System.out.println(brand +"运行");
    }
}
//|--奔驰车
class BenChi extends QiChe{
    //	行为：运行
    public void work(String brand){
        System.out.println(brand +"运行");
    }
}
//|--宝马车
//现在要求为所有“宝马车系”的汽车增加一个GPS功能。
class BaoMa extends QiChe implements Gps{
    //	行为：运行
    public void work(String brand){
        System.out.println(brand +"运行");
    }

    @Override
    public void gps() {
        System.out.println("宝马车gps功能");
    }
}