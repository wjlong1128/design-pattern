package com.github.wjlong1128._09_state;

import com.github.wjlong1128._09_state.state.State;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class Context {
    private State state;

    public void changeState(State state){
        this.state = state;
    }

    public void doSomething(){
        this.state.doWork();
    }

}
