package com.jiangyunpeng.mode.decoration;

/**
 * 饮料抽象类
 * Created by jyp on 2017/10/10.
 */
public abstract class Beverage {
    String description = "unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
