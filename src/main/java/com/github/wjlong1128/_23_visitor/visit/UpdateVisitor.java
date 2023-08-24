package com.github.wjlong1128._23_visitor.visit;

import com.github.wjlong1128._23_visitor.hardware.CPU;
import com.github.wjlong1128._23_visitor.hardware.Disk;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class UpdateVisitor implements Visitor{
    @Override
    public void visitCPU(CPU cpu) {
        String newCommand = cpu.getCommand() + ": 1+1=2";
        cpu.setCommand(newCommand);
    }

    @Override
    public void visitDisk(Disk disk) {
        String newCommand = disk.getCommand() + ":更改 1+1=2";
        disk.setCommand(newCommand);
    }
}
