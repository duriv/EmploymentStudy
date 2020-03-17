package com.itheima.homework.work04;
/*
四 编程题【接口】
4.1 题目
	一个机动车管理系统中有以下类的设计：
	机动车类：
		|--汽车类：
			|--奔驰车
			|--宝马车
		|--摩托车类：
			|--雅马哈摩托
			|--宝马摩托
	所有的车都有如下信息：
	属性：品牌、价格
	行为：运行
现在要求为所有“宝马车系”的汽车增加一个GPS功能。
4.2 要求
	请设计出上述的类结构，并用代码实现。
 */
/*
3个等级先使用继承
然后增加的GPS功能使用接口定义
 */
public class Test04 {
    public static void main(String[] args) {
//        			|--奔驰车
        BenChi benChi = new BenChi();
        benChi.work("奔驰");
//			|--宝马车
        BaoMa baoMa = new BaoMa();
        baoMa.gps();
        baoMa.work("宝马车");
//			|--雅马哈摩托
        YaMaHa yaMaHa = new YaMaHa();
        yaMaHa.work("雅马哈摩托");
//			|--宝马摩托
        BaoMaM baoMaM = new BaoMaM();
        baoMaM.gps();
        baoMaM.work("宝马摩托车");
    }
}
