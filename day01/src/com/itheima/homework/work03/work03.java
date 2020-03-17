package com.itheima.homework.work03;
/*
三 编程题【继承】
3.1 题目：
	我们计划为一个动物园制作一套信息管理系统，根据与甲方沟通，我们归纳了有以下几种动物需要记录到系统中：
	鸟类：鹦鹉、猫头鹰、喜鹊
	哺乳类：大象、狼、长颈鹿
	爬行类：鳄鱼、蛇、乌龟
3.2 要求：
	请根据以上需求，使用“继承”设计出三层的类结构：
		动物类：
			|--鸟类：
				|--鹦鹉类
				|--猫头鹰类
				|--喜鹊类
			|--哺乳类：
				|--大象类
				|--狼类
				|--长颈鹿类
			|--爬行类：
				|--鳄鱼类
				|--蛇类
				|--乌龟类
	作为父类的类都应该定义一些共性内容，每种子类也都有一些特定的内容。
	重点是类的层次结构，类成员简单表示即可。

 */
public class work03 {
    public static void main(String[] args) {
//    		动物类：
//			|--鸟类：
//				|--鹦鹉类
        YingWu yw = new YingWu();
        yw.eat("鹦鹉");
        yw.fly("鹦鹉");
        yw.a();
//				|--猫头鹰类
        MaoTouYing mty = new MaoTouYing();
        mty.eat("猫头鹰");
        mty.fly("猫头鹰");
        mty.b();
//				|--喜鹊类
        XiQue xq = new XiQue();
        xq.eat("喜鹊");
        xq.fly("喜鹊");
        xq.c();
//			|--哺乳类：
//				|--大象类
        DaXiang dx = new DaXiang();
        dx.eat("大象");
        dx.HengWen("大象");
        dx.d();
//				|--狼类
        Lang lang = new Lang();
        lang.eat("狼");
        lang.HengWen("狼");
        lang.e();
//				|--长颈鹿类
        ChangJinLv cjl = new ChangJinLv();
        cjl.eat("长颈鹿");
        cjl.HengWen("长颈鹿");
        cjl.f();
//			|--爬行类：
//				|--鳄鱼类
        EYu ey = new EYu();
        ey.eat("鳄鱼");
        ey.eat("鳄鱼");
        ey.g();
//				|--蛇类
        She she = new She();
        she.eat("蛇");
        she.Pa("蛇");
        she.h();
//				|--乌龟类
        WuGui wg = new WuGui();
        wg.eat("乌龟");
        wg.Pa("乌龟");
        wg.i();
    }
}
//动物
class Animal{
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
//动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
// |--鸟类：
class Bird extends Animal{
    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }
//鸟类飞
    public void fly(String name){
        System.out.println(name+"会飞");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
//        |--鹦鹉类
    class YingWu extends Bird{
    public YingWu() {
    }

    public YingWu(String name) {
        super(name);
    }
    //鹦鹉、、、、
    public void a(){
        System.out.println("鹦鹉");
    }
    //鸟类飞
    public void fly(String name){
        System.out.println(name+"会飞");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
//        |--猫头鹰类
    class MaoTouYing extends Bird{
    public MaoTouYing() {
    }

    public MaoTouYing(String name) {
        super(name);
    }
    //猫头鹰。。
    public void b(){
        System.out.println("猫头鹰");
    }
    //鸟类飞
    public void fly(String name){
        System.out.println(name+"会飞");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
//        |--喜鹊类
    class XiQue extends Bird{
    public XiQue() {
    }

    public XiQue(String name) {
        super(name);
    }
    //喜鹊。。
    public void c(){
        System.out.println("喜鹊");
    }
    //鸟类飞
    public void fly(String name){
        System.out.println(name+"会飞");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
// |--哺乳类：
    class BuRu extends Animal{
    public BuRu() {
    }

    public BuRu(String name) {
        super(name);
    }
    //哺乳类恒温
    public void HengWen(String name){
        System.out.println(name+"恒温恒温");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
//        |--大象类
    class DaXiang extends BuRu{
    public DaXiang() {
    }

    public DaXiang(String name) {
        super(name);
    }
    //大象。。
    public void d(){
        System.out.println("大象");
    }
    //哺乳类恒温
    public void HengWen(String name){
        System.out.println(name+"恒温恒温");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
//        |--狼类
    class Lang extends BuRu{
    public Lang() {
    }

    public Lang(String name) {
        super(name);
    }
    //狼。。
    public void e(){
        System.out.println("狼");
    }
    //哺乳类恒温
    public void HengWen(String name){
        System.out.println(name+"恒温恒温");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
//        |--长颈鹿类
    class ChangJinLv extends BuRu{
    public ChangJinLv() {
    }

    public ChangJinLv(String name) {
        super(name);
    }
    //长颈鹿
    public void f(){
        System.out.println("长颈鹿");
    }
    //哺乳类恒温
    public void HengWen(String name){
        System.out.println(name+"恒温恒温");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
// |--爬行类：
    class PaXing extends Animal{
    public PaXing() {
    }

    public PaXing(String name) {
        super(name);
    }
    //爬行类爬
    public void   Pa(String name){
        System.out.println(name+"爬行类爬");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
//        |--鳄鱼类
class EYu extends PaXing{
    public EYu() {
    }

    public EYu(String name) {
        super(name);
    }
    //鳄鱼
    public void g(){
        System.out.println("鳄鱼");
    }
    //爬行类爬
    public void   Pa(String name){
        System.out.println(name+"爬行类爬");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
//        |--蛇类
class She extends PaXing{
    public She() {
    }

    public She(String name) {
        super(name);
    }
    //蛇
    public void h(){
        System.out.println("蛇");
    }
    //爬行类爬
    public void   Pa(String name){
        System.out.println(name+"爬行类爬");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}
//        |--乌龟类
class WuGui extends PaXing{
    public WuGui() {
    }

    public WuGui(String name) {
        super(name);
    }
    //乌龟
    public void i(){
        System.out.println("乌龟");
    }
    //爬行类爬
    public void   Pa(String name){
        System.out.println(name+"爬行类爬");
    }
    //动物吃
    public void eat(String name){
        System.out.println(name+"有一个吃饭的好习惯");
    }
}