package com.github.wjlong1128._05_decorator.decorator;

import com.github.wjlong1128._05_decorator.robot.Robot;

/**
 * @author wjlong128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public abstract class RobotDecorator implements Robot {
    private Robot robot;

    public RobotDecorator(Robot robot) {
        this.robot = robot;
    }

    protected abstract void after();

    protected abstract void before();

    @Override
    public final void doSomething() {
        this.before();
        this.robot.doSomething();
        this.after();
    }

}
