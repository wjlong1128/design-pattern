package com.github.wjlong1128._14_fly_weight;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public abstract class BikeFlyWeight {
    protected int state = 0;

    /**
     * 骑走
     * @param username
     */
    abstract void ride(String username);

    /**
     * 归还
     */
    abstract void back();

    public int getState() {
        return state;
    }
}
