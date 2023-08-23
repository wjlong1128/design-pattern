package com.github.wjlong1128._05_decorator.decorator;

import com.github.wjlong1128._05_decorator.robot.Robot;

/**
 * @author wjlong128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class DanceRobotDecorator extends RobotDecorator {
    public DanceRobotDecorator(Robot robot) {
        super(robot);
    }

    @Override
    public void after() {
        System.out.println("开始跳舞....");
    }

    @Override
    public void before() {

    }
}
