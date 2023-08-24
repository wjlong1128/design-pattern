package com.github.wjlong1128._21_bridg;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestBridging {
    public static void main(String[] args) {

    }
}

abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void doWork(){
        this.implementor.doSomething();
    }
}

interface Implementor{
    void doSomething();
}