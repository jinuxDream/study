package com.jiangyunpeng.mode.factory.abstact;


/**
 * Created by jyp on 2017/10/11.
 */
public class BjPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new BjPizzaFactory();
        if (type.equals("1")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("bj chees Pizza");
        }else if (type.equals("2")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("bj clamPizza Pizza");
        }
        return pizza;
    }
}
