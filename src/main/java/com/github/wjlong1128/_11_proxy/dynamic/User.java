package com.github.wjlong1128._11_proxy.dynamic;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/24
 * @desc
 */
@Data
@Accessors(chain = true)
public class User {
    private int id;
    private String name;
}
