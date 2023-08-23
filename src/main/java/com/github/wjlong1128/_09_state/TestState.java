package com.github.wjlong1128._09_state;

import com.github.wjlong1128._09_state.state.Angry;
import com.github.wjlong1128._09_state.state.Happy;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestState {
    public static void main(String[] args) {
        Context context = new Context();
        context.changeState(new Angry());
        context.doSomething();
        context.changeState(new Happy());
        context.doSomething();
    }
}
