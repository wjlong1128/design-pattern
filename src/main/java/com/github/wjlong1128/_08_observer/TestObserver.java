package com.github.wjlong1128._08_observer;

import cn.hutool.json.JSONUtil;
import com.github.wjlong1128._08_observer.recevie.AListener;
import com.github.wjlong1128._08_observer.recevie.BListener;
import com.github.wjlong1128._08_observer.recevie.MessageRecipient;
import com.github.wjlong1128._08_observer.sender.MessageSender;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestObserver {

    public static void main(String[] args) {
        List<MessageRecipient> recipients = Arrays.asList(
                new AListener(),
                new BListener()
        );

        MessageSender<Message> sender = new MessageSender<Message>(new HashSet<>(recipients)) {
            @Override
            public String convert(Message message) {
                return JSONUtil.toJsonStr(message);
            }
        };

        sender.send(new Message.MessageBuilder().id(1).body("start sing").build());
    }
}
