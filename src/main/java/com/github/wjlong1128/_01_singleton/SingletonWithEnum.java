package com.github.wjlong1128._01_singleton;

/**
 * @author wjlong128
 * @version 1.0
 * @date 2023/8/22
 * @desc 枚举单例
 */
public enum SingletonWithEnum {
    INSTANCE;

    public static void main(String[] args) {
        System.out.println(INSTANCE);
    }

}
