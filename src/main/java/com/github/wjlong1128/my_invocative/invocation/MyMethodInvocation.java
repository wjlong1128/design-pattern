package com.github.wjlong1128.my_invocative.invocation;

import com.github.wjlong1128.my_invocative.Signature;
import com.github.wjlong1128.my_invocative.advice.MethodInterceptor;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */

public class MyMethodInvocation implements MethodInvocation {
    private Signature signature;
    private List<MethodInterceptor> methodInterceptors;
    private int count = 0;

    public MyMethodInvocation(Object target, Method method, Object[] args, List<MethodInterceptor> methodInterceptors) {
        this.signature = new Signature(target,method,args);
        this.methodInterceptors = methodInterceptors;
    }

    @Override
    public Object proceed() throws Throwable {
        if (count >= methodInterceptors.size()) {
            // There are no interceptors that can be used
            // reset count
            count = 0;
            return signature.getMethod().invoke(signature.getTarget(), signature.getArgs());
        }
        MethodInterceptor interceptor = this.methodInterceptors.get(count);
        count++;
        return interceptor.invoke(this);
    }


    public Signature signature() {
        return signature;
    }

}
