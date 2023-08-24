package com.github.wjlong1128._14_fly_weight;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class BikeFlyWeightFactory {
    private static final BikeFlyWeightFactory instance = new BikeFlyWeightFactory();

    private Set<BikeFlyWeight> pool = new HashSet<>();

    public static BikeFlyWeightFactory getInstance() {
        return instance;
    }

    private BikeFlyWeightFactory() {
        for (int i = 0; i < 3; i++) {
            pool.add(new MoBikeFlyWeight("No." + i));
        }
    }

    public BikeFlyWeight getBike() {
        for (BikeFlyWeight bikeFlyWeight : pool) {
            if (bikeFlyWeight.getState() == 0) {
                return bikeFlyWeight;
            }
        }
        return null;
    }


}
