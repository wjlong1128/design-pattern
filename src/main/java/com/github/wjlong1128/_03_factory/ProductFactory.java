package com.github.wjlong1128._03_factory;

import com.github.wjlong1128._02_simplefactory.product.Product;

/**
 * @author wjlong128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public abstract class ProductFactory {
    public abstract Product createProduct();

    public static void main(String[] args) {
        ProductFactory carFactory = new CarFactory();
        ProductFactory toyFactory = new ToyFactory();
        System.out.println(carFactory.createProduct());
        System.out.println(toyFactory.createProduct());
    }

}
