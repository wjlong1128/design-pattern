package com.github.wjlong1128._18_note;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestNote {
    public static void main(String[] args) {
        History history = new History();
        Document document = new Document();
        document.change("version1");
        history.add(document.saveBackUp());

        document.change("version2");
        history.add(document.saveBackUp());

        document.change("version3");

        document.resume(history.getLastVersion());
        document.print();

        document.resume(history.getLastVersion());
        document.print();
    }
}
