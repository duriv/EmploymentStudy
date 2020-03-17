package com.itheima.homework.work04;
/*
	|--摩托车类：
			|--雅马哈摩托
			|--宝马摩托
 */
public class MoTuoChe extends MotorVehicle{
    //	行为：运行
    public void work(String brand){
        System.out.println(brand +"运行");
    }
}
//			|--雅马哈摩托
class YaMaHa extends MotorVehicle{
    //	行为：运行
    public void work(String brand){
        System.out.println(brand +"运行");
    }
}
//			|--宝马摩托
//现在要求为所有“宝马车系”的汽车增加一个GPS功能。
class BaoMaM extends MotorVehicle implements Gps{
    //	行为：运行
    public void work(String brand){
        System.out.println(brand +"运行");
    }

    @Override
    public void gps() {
        System.out.println("宝马摩托gps功能");
    }
}