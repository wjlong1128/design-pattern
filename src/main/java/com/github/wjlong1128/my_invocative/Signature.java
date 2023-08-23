package com.github.wjlong1128.my_invocative;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.reflect.Method;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
@Getter
@AllArgsConstructor
public class Signature {

    private final Object target;
    private final Method method;
    private final Object[] args;

}
