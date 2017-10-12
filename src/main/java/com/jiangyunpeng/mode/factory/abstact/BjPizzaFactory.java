package com.jiangyunpeng.mode.factory.abstact;

/**
 * Created by jyp on 2017/10/11.
 */
public class BjPizzaFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        System.out.println("Dough--------");
        return new Dough();
    }

    public Sauce createSauce() {
        System.out.println("Sauce--------");
        return new Sauce();
    }

    public Cheese createCheese() {
        System.out.println("Cheese--------");
        return new Cheese();
    }

    public Veggies[] createVeggies() {
        System.out.println("Veggies[]--------");
        return new Veggies[]{new Veggies()};
    }

    public Pepperoni createPepperoni() {
        System.out.println("Pepperoni--------");
        return new Pepperoni();
    }

    public Clams createClams() {
        System.out.println("Clams--------");
        return new Clams();
    }
}
