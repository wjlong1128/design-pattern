package com.github.wjlong1128._06_adapter.message;

import cn.hutool.json.XML;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class WriteXml {

    public static void main(String[] args) {
        String xml = new WriteXml().writeXml();
        System.out.println(XML.toJSONObject(xml).toJSONString(1));
    }
    public String writeXml() {
        return "<user>\n" +
                "    <name>zhangsan</name>\n" +
                "    <sex>男</sex>\n" +
                "    <age>12</age>\n" +
                "</user>";
    }

}
