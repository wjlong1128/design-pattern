package com.github.wjlong1128.my_invocative.invocation;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public interface MethodInvocation {
     /**
      *  Initiates a call, executes the method, and returns the method return value
      * @return
      * @throws Throwable
      */
     Object proceed() throws Throwable;
}
