package com.github.wjlong1128._23_visitor.hardware;

import com.github.wjlong1128._23_visitor.visit.Visitor;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class Disk extends Hardware{
    public Disk(String command) {
        super(command);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDisk(this);
    }
}
