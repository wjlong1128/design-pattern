package com.github.wjlong1128._12_chain;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class BossHandler extends Handler {

    public BossHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String resultMsg(int i) {
        return "Boss 处理{" + i + "}成功";
    }

    @Override
    protected boolean support(int i) {
        return true;
    }
}
