package com.jiangyunpeng.mode.proxy.staticproxy;

/**
 * Created by jyp on 2017/11/3.
 */
public class Staticproxy implements Hello {

    Hello hello;

    public Staticproxy(Hello hello) {
        this.hello = hello;
    }

    public void sayHello() {
        System.out.println("before");
        hello.sayHello();
        System.out.println("after");
    }

    public static void main(String[] args) {
        Staticproxy staticproxy = new Staticproxy(new HelloImpl());
        staticproxy.sayHello();
    }
}
