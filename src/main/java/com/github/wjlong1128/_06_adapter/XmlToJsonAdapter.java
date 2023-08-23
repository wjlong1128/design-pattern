package com.github.wjlong1128._06_adapter;

import cn.hutool.json.XML;
import com.github.wjlong1128._06_adapter.message.JsonMessage;
import com.github.wjlong1128._06_adapter.message.WriteXml;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class XmlToJsonAdapter implements JsonMessage {
    private WriteXml writeXml;

    public XmlToJsonAdapter(WriteXml writeXml) {
        this.writeXml = writeXml;
    }

    @Override
    public String message() {
        String xml = writeXml.writeXml();
        return XML.toJSONObject(xml).toString();
    }
}
