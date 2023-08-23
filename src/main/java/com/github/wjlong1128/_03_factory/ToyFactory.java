package com.github.wjlong1128._03_factory;

import com.github.wjlong1128._02_simplefactory.product.Product;
import com.github.wjlong1128._02_simplefactory.product.Toy;

/**
 * @author wjlong128
 * @version 1.0
 * @date 2023/8/22
 * @desc
 */
public class ToyFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return new Toy();
    }
}
