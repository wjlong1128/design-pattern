package com.github.wjlong1128.my_invocative.advice;

import com.github.wjlong1128.my_invocative.invocation.MethodInvocation;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public interface MethodInterceptor {

    Object invoke(MethodInvocation invocation) throws Throwable;

}
