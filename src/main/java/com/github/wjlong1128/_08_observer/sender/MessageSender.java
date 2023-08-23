package com.github.wjlong1128._08_observer.sender;

;

import com.github.wjlong1128._08_observer.recevie.MessageRecipient;

import java.util.Set;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc 借款抽象类
 */
public abstract class MessageSender<T> {

    /**
     * 消息接收方集合
     */
    private final Set<MessageRecipient> credits;

    public MessageSender(Set<MessageRecipient> credits) {
        this.credits = credits;
    }

    public final void addRecipient( MessageRecipient recipient) {
        this.credits.add(recipient);
    }

    public abstract String convert(T message);
    /**
     * 广播方法
     */
    public final void send(T message){
        for (MessageRecipient credit : this.credits) {
            credit.receive(this.convert(message));
        }
    };

}
