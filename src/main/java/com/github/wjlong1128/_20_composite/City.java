package com.github.wjlong1128._20_composite;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class City implements Counter{
    int sum;

    public City(int sum) {
        this.sum = sum;
    }

    @Override
    public int count() {
        return sum;
    }
}
