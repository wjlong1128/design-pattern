package com.github.wjlong1128._12_chain;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestChain {
    public static void main(String[] args) {
        int task = 11;
        Handler handler = new LeaderHandler(new BossHandler(null));
        String process = handler.process(task);
        System.out.println(process);
    }
}
