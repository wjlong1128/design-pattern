package com.github.wjlong1128.my_invocative.advice;

import com.github.wjlong1128.my_invocative.Signature;
import com.github.wjlong1128.my_invocative.invocation.MethodInvocation;
import com.github.wjlong1128.my_invocative.invocation.MyMethodInvocation;

import java.util.Arrays;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class BeforeMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        if (invocation instanceof MyMethodInvocation){
            Signature signature = ((MyMethodInvocation) invocation).signature();
            this.before(signature);
        }
        Object proceed = invocation.proceed();
        return proceed;
    }

    public void before(Signature signature) {
        System.out.println("before 执行方法:"+ signature.getMethod() + " 方法参数:"+ Arrays.toString(signature.getArgs()));
    }
}
