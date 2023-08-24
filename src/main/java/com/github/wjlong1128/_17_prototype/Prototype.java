package com.github.wjlong1128._17_prototype;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public interface Prototype {
    Object clone();

    public static void main(String[] args) {
        Plane plane = new Plane();
        Plane clone = (Plane)plane.clone();
        System.out.println(clone);
    }
    
}
