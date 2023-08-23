package com.github.wjlong1128._06_adapter;

import com.github.wjlong1128._06_adapter.message.JsonMessage;
import com.github.wjlong1128._06_adapter.message.WriteXml;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class TestAdapter {
    public static void main(String[] args) {
        WriteXml writeXml = new WriteXml();
        JsonMessage jsonMessage = new XmlToJsonAdapter(writeXml);
        String message = jsonMessage.message();
        System.out.println(message);
    }
}
