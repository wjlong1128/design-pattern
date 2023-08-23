package com.github.wjlong1128._08_observer.recevie;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc 消息接收接口
 */
public interface MessageRecipient {

    void receive(String message);

}
