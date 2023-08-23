package com.github.wjlong1128._12_chain;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public abstract class Handler {
    protected Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final String process(int i) {
        if (this.support(i)) {
            return this.resultMsg(i);
        }
        if (this.nextHandler == null) {
            return null;
        }
        return this.nextHandler.process(i);
    }

    protected abstract String resultMsg(int i);

    protected abstract boolean support(int i);


}
