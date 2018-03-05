package com.jiangyunpeng.mode.rpc;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 * Created by user on 2018/2/28.
 */
public class RPCClient {

    public static void main(String[] args) {
        HelloService helloService = getClient(HelloService.class,"127.0.0.1",8888);
        System.out.println(helloService.sayHallo("11111111111111"));
    }

    @SuppressWarnings("unchecked")
    private static <T> T getClient(Class<T> clazz, final String ip, final int port) {
        return (T) Proxy.newProxyInstance(RPCClient.class.getClassLoader(), new Class<?>[]{clazz}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws IOException, ClassNotFoundException {
                Socket socket = new Socket(ip,port);
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                out.writeUTF(method.getName());
                out.writeObject(method.getParameterTypes());
                out.writeObject(args);
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                return in.readObject();
            }
        });
    }
}
