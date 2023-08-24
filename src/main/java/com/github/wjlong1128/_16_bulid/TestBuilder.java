package com.github.wjlong1128._16_bulid;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
@Builder
@ToString
@Getter
public class TestBuilder {

    private String name;
    private int age;

    public static void main(String[] args) {
        TestBuilder zhangsan = new TestBuilderBuilder().age(19).name("zhangsan").build();
        System.out.println(zhangsan);
    }
}
