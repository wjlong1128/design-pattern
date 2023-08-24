package com.github.wjlong1128._17_prototype;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class Plane implements Prototype {
    private String name;
    private String type;

    public Plane() {
        this.name = "Name." + Math.random();
        this.type = "Type." + Math.random();
    }

    public Plane(Plane plane) {
        this.name = plane.name;
        this.type = plane.type;
    }


    @Override
    public Object clone() {
        return new Plane(this);
    }
}
