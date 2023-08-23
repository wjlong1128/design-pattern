package com.github.wjlong1128._07_facade;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestFacade {
    public static void main(String[] args) {
        boolean prove = new Facade().prove();
        System.out.println(prove);
    }
}

class Facade {
    SubFlow1 subFlow1 = new SubFlow1();
    SubFlow2 subFlow2 = new SubFlow2();
    SubFlow3 subFlow3 = new SubFlow3();

    public boolean prove() {
        return subFlow1.isOK() && subFlow2.isTrue() && subFlow3.isGood();
    }
}

class SubFlow1 {
    public boolean isOK() {
        return true;
    }
}

class SubFlow2 {
    public boolean isTrue() {
        return true;
    }
}

class SubFlow3 {
    public boolean isGood() {
        return true;
    }
}