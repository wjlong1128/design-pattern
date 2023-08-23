package com.github.wjlong1128._01_singleton;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Thread.currentThread;

/**
 * @author wjlong128
 * @version 1.0
 * @date 2023/8/22
 * @desc 饿汉式单例
 */
@Slf4j
public final class SingletonWithHunger {

    private static final SingletonWithHunger SINGLETON = new SingletonWithHunger();

    private SingletonWithHunger() {
        System.out.println("init...");
    }

    public static SingletonWithHunger getInstance() {
        return SINGLETON;
    }

    public static void main(String[] args) {
        final ConcurrentHashMap<SingletonWithHunger, String> map = new ConcurrentHashMap<>();
        List<Thread> threads = Stream.iterate(0, i -> ++i).limit(1000)
                .map(i -> new Thread(() -> {
                    try {
                        Thread.sleep(1000L);
                        SingletonWithHunger instance = getInstance();
                        String name = currentThread().getName();
                        log.info("{} 创建{}", name, instance);
                        map.put(instance, name);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }, "test_thread_" + i))
                .collect(Collectors.toList());
        threads.forEach(Thread::start);
        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(map);
    }
}
