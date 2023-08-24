package com.github.wjlong1128._11_proxy.dynamic;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/24
 * @desc
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(int id) {
        return new User().setId(id).setName("用户" + id + "号");
    }
}
