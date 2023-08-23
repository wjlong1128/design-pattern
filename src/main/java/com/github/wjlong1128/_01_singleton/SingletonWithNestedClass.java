package com.github.wjlong1128._01_singleton;

/**
 * @author wjlong128
 * @version 1.0
 * @date 2023/8/22
 * @desc 静态内部类单例
 */
public class SingletonWithNestedClass {
    private SingletonWithNestedClass() {
        System.out.println("init...");
    }

    public static SingletonWithNestedClass getInstance() {
        return Builder.SINGLETON;
    }

    private static class Builder {
        private static final SingletonWithNestedClass SINGLETON = new SingletonWithNestedClass();
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
    }

}
