package com.github.wjlong1128.my_invocative;

import com.github.wjlong1128.my_invocative.advice.AfterMethodInterceptor;
import com.github.wjlong1128.my_invocative.advice.BeforeMethodInterceptor;
import com.github.wjlong1128.my_invocative.advice.MethodInterceptor;
import com.github.wjlong1128.my_invocative.invocation.MethodInvocation;
import com.github.wjlong1128.my_invocative.invocation.MyMethodInvocation;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class TestMethodInvocation {
    public static class Target {
        public String foo(String s) {
            System.out.println("foo...");
            return s + " foo";
        }

        public void bar() {
            System.out.println("bar...");
        }
    }

    public static void main(String[] args) throws Throwable {
        Target target = new Target();
        Method foo = target.getClass().getMethod("foo", String.class);
        Method bar = target.getClass().getMethod("bar");
        Object[] params = {"fooArgs:"};
        List<MethodInterceptor> interceptors = Arrays.asList(
                new AfterMethodInterceptor(),
                new BeforeMethodInterceptor()
        );
        MethodInvocation invocation = new MyMethodInvocation(target, foo, params, interceptors);
        invocation.proceed();
        Object result = invocation.proceed();
        System.out.println(result);
    }
}
