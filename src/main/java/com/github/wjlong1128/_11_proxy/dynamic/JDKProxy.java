package com.github.wjlong1128._11_proxy.dynamic;

import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/24
 * @desc
 */
public class JDKProxy {
    public static void main(String[] args) {
        UserServiceImpl target = new UserServiceImpl();
        ClassLoader loader = JDKProxy.class.getClassLoader();
        Class[] interfaces = {target.getClass().getInterfaces()[0]};
        Object proxyInstance = Proxy.newProxyInstance(loader, interfaces, (proxy, method, params) -> {
            System.out.println("before...params: "+ Arrays.toString(params));
            Object result = method.invoke(target, params);
            System.out.println("after...result: "+result);
            return result;
        });
        UserService userService = (UserService) proxyInstance;
        User user = userService.getUser(1);
        System.out.println(user);
    }
}
