package com.github.wjlong1128._13_template_method;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        Cooking cooking = new CookingFood();
        cooking.cooking();
    }
}

abstract class Cooking{
    abstract void step1();
    abstract void step2();
    public final void cooking(){
        System.out.println("start");
        this.step1();
        this.step2();
        System.out.println("end...");
    }
}

class CookingFood extends Cooking{

    @Override
    void step1() {
        System.out.println("放鸡蛋");
    }

    @Override
    void step2() {
        System.out.println("放番茄");
    }
}
