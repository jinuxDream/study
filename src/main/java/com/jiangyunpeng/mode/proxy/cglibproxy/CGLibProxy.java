package com.jiangyunpeng.mode.proxy.cglibproxy;

import com.jiangyunpeng.mode.proxy.staticproxy.Hello;
import com.jiangyunpeng.mode.proxy.staticproxy.HelloImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by jyp on 2017/11/3.
 */
public class CGLibProxy implements MethodInterceptor {

    // 单例模式
    private static CGLibProxy instance = new CGLibProxy();
    private CGLibProxy() {}
    public static CGLibProxy getInstance () { return instance; }
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object invoke = method.invoke(o, objects);
        System.out.println("after");
        return invoke;
    }

    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        Hello hello = cgLibProxy.getProxy(HelloImpl.class);
        hello.sayHello();
    }
}
