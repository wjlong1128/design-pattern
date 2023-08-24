package com.github.wjlong1128._20_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class Composite implements Counter {

    private List<Counter> counters = new ArrayList<>();

    public void add(Counter counter) {
        this.counters.add(counter);
    }

    private boolean remove(Counter counter) {
        return this.counters.remove(counter);
    }

    public List<Counter> getChild() {
        return this.counters;
    }

    @Override
    public int count() {
        int i = 0;
        for (Counter counter : this.counters) {
            i += counter.count();
        }
        return i;
    }
}
