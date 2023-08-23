package com.github.wjlong1128._10_policy;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestPolicy {
    public static void main(String[] args) {
        new ThreadPoolExecutor(
                6,
                8,
                30,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(),
                Executors.defaultThreadFactory(),
                // 策略
                new ThreadPoolExecutor.AbortPolicy()
        );
    }
}
