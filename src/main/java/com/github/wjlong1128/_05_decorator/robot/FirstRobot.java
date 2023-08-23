package com.github.wjlong1128._05_decorator.robot;

/**
 * @author wjlong128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class FirstRobot implements Robot{

    @Override
    public void doSomething() {
        System.out.println("对话");
        System.out.println("唱歌");
    }

}
