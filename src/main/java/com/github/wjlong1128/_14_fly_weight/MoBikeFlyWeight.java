package com.github.wjlong1128._14_fly_weight;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class MoBikeFlyWeight extends BikeFlyWeight{
    private String bikeId;

    public MoBikeFlyWeight(String bikeId) {
        this.bikeId = bikeId;
    }

    @Override
    void ride(String username) {
        state = 1;
        System.out.println(username + "骑"+bikeId +"号自行车出行");
    }

    @Override
    void back() {
        state = 0;
    }
}
