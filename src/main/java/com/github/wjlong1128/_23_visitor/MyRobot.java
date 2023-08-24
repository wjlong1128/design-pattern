package com.github.wjlong1128._23_visitor;

import com.github.wjlong1128._23_visitor.hardware.CPU;
import com.github.wjlong1128._23_visitor.hardware.Disk;
import com.github.wjlong1128._23_visitor.visit.Visitor;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class MyRobot {

    private CPU cpu;
    private Disk disk;

    public MyRobot() {
        this.cpu = new CPU("记住 1+1=1");
        this.disk = new Disk("1+1=1");
    }

    public void calc() {
        this.cpu.run();
        this.disk.run();
    }

    public void accept(Visitor visitor) {
        cpu.accept(visitor);
        disk.accept(visitor);
    }

}
