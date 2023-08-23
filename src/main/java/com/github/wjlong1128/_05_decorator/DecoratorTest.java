package com.github.wjlong1128._05_decorator;

import com.github.wjlong1128._05_decorator.decorator.DanceRobotDecorator;
import com.github.wjlong1128._05_decorator.robot.FirstRobot;
import com.github.wjlong1128._05_decorator.robot.Robot;

/**
 * @author wjlong128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Robot robot = new FirstRobot();
        robot = new DanceRobotDecorator(robot);
        robot.doSomething();
    }
}
