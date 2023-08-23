package com.github.wjlong1128._08_observer;

import lombok.Builder;
import lombok.Getter;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
@Getter
@Builder
public class Message {
    private int id;
    private String body;
}
