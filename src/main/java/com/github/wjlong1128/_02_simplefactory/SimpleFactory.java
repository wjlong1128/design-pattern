package com.github.wjlong1128._02_simplefactory;

import com.github.wjlong1128._02_simplefactory.product.Car;
import com.github.wjlong1128._02_simplefactory.product.Product;
import com.github.wjlong1128._02_simplefactory.product.Toy;

/**
 * @author wjlong128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class SimpleFactory {
    public static Product createProduct(String type){
        if ("car".equals(type)) return new Car();
        if ("toy".equals(type)) return new Toy();
        return null;
    }

    public static void main(String[] args) {
        // DateTimeFormatter.ofLocalizedDateTime()
        System.out.println(SimpleFactory.createProduct("car"));
    }

}
