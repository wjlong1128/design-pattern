package com.github.wjlong1128._12_chain;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class LeaderHandler extends Handler {

    public LeaderHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String resultMsg(int i) {
        return "Leader处理 {" + i + "} 成功";
    }

    @Override
    protected boolean support(int i) {
        return i <= 10;
    }
}
