package com.github.wjlong1128._18_note;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class Document {

    private String context;

    public BackUp saveBackUp() {
        return new BackUp(this.context);
    }

    public void resume(BackUp backUp) {
        this.context = backUp.getContext();
    }

    public void change(String context) {
        this.context = context;
    }

    public void print(){
        System.out.println(this.context);
    }

}


