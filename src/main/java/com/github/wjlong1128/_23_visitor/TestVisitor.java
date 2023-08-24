package com.github.wjlong1128._23_visitor;

import com.github.wjlong1128._23_visitor.visit.UpdateVisitor;
import com.github.wjlong1128._23_visitor.visit.Visitor;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestVisitor {
    public static void main(String[] args) {
        MyRobot myRobot = new MyRobot();
        myRobot.calc();
        Visitor visitor = new UpdateVisitor();
        myRobot.accept(visitor);
        myRobot.calc();
    }
}
