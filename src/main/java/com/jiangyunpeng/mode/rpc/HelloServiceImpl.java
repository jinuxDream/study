package com.jiangyunpeng.mode.rpc;

/**
 * Created by user on 2018/2/28.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHallo(String str) {
        return str + " hello";
    }
}
