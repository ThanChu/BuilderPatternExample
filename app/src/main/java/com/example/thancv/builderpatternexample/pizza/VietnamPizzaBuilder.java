package com.example.thancv.builderpatternexample.pizza;

/**
 * Created by ThanCV on 8/8/2017.
 */

public class VietnamPizzaBuilder extends PizzaBuilder {

    @Override
    public PizzaBuilder build() {
        createPizza();
        return this;
    }

    @Override
    public PizzaBuilder buildShape() {
        pizza.setShape("Vietnam Shape");
        return this;
    }

    @Override
    public PizzaBuilder buildSauce() {
        pizza.setSauce("Vietnam Sauce");
        return this;
    }

    @Override
    public PizzaBuilder buildDough() {
        pizza.setDough("Vietnam Dough");
        return this;
    }

    @Override
    public Pizza pizza() {
        return getPizza();
    }
}
