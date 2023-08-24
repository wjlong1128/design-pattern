package com.github.wjlong1128.test;

import com.github.wjlong1128.my_invocative.advice.AfterMethodInterceptor;
import com.github.wjlong1128.my_invocative.invocation.MyMethodInvocation;
import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/24
 * @desc
 */
public class TestClassLoader {

    @Test
    void testClassLoader(){
        ClassLoader loader1 = ReentrantLock.class.getClassLoader();
        ClassLoader loader2 = String.class.getClassLoader();
        System.out.println(loader1 + "  "+ loader2);
    }

    @Test
    void testClassLoader2() {
        ClassLoader loader = AfterMethodInterceptor.class.getClassLoader();
        System.out.println(loader);
        System.out.println(MyMethodInvocation.class.getClassLoader());
        System.out.println(loader.getParent());
    }
}
