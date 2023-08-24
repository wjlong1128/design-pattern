package com.github.wjlong1128._14_fly_weight;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class TestFlyWeight {
    public static void main(String[] args) {
        BikeFlyWeightFactory instance = BikeFlyWeightFactory.getInstance();
        BikeFlyWeight bike = instance.getBike();
        bike.ride("张三");
    }
}
