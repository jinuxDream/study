package com.jiangyunpeng.mode.factory.abstact;

/**
 * Created by jyp on 2017/10/11.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    void prepare() {
        System.out.println("preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
        veggies = pizzaIngredientFactory.createVeggies();
    }

    @Override
    void cut() {
        System.out.println("Clam cut.....");
    }
}
