package com.jiangyunpeng.mode.rpc;

import java.io.IOException;

/**
 * Created by user on 2018/2/28.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        HelloService helloService = new HelloServiceImpl();

        RPCServer server = new RPCServer();
        server.register(helloService, 8888);
    }
}
