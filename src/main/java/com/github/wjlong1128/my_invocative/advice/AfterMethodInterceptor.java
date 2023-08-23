package com.github.wjlong1128.my_invocative.advice;

import com.github.wjlong1128.my_invocative.invocation.MethodInvocation;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class AfterMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object proceed = invocation.proceed();
        this.after(proceed);
        return proceed;
    }

    public void after(Object proceed) {
        System.out.println(this.getClass().getSimpleName() + " after...");
    }
}
