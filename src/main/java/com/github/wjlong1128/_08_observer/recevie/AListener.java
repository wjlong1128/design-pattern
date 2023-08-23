package com.github.wjlong1128._08_observer.recevie;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class AListener implements MessageRecipient{
    @Override
    public void receive(String message) {
        System.out.println("a: " + message);
    }
}
