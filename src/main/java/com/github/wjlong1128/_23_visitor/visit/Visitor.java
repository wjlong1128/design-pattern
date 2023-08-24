package com.github.wjlong1128._23_visitor.visit;

import com.github.wjlong1128._23_visitor.hardware.CPU;
import com.github.wjlong1128._23_visitor.hardware.Disk;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public interface Visitor {

    void visitCPU(CPU cpu);

    void visitDisk(Disk disk);
}
