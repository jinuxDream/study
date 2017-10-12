package com.jiangyunpeng.mode.factory.abstact;


/**
 * Created by jyp on 2017/10/11.
 */
public class NyPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        NyPizzaFactory nyPizzaFactory = new NyPizzaFactory();
        if (type.equals("1")){
            pizza = new CheesePizza(nyPizzaFactory);
            pizza.setName("ny chees Pizza");
        }else if (type.equals("2")){
            pizza = new ClamPizza(nyPizzaFactory);
            pizza.setName("ny clamPizza Pizza");
        }
        return pizza;
    }

}
