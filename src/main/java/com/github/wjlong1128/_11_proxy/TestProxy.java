package com.github.wjlong1128._11_proxy;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestProxy {
    public static void main(String[] args) {
        Subject subject = new RealSubjectProxy();
        subject.doWork();
    }
}
