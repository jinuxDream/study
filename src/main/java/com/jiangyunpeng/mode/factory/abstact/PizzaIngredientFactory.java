package com.jiangyunpeng.mode.factory.abstact;

/**
 * Created by jyp on 2017/10/11.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
