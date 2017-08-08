package com.example.thancv.builderpatternexample.pizza;

/**
 * Created by ThanCV on 8/8/2017.
 */

public class JapanPizzaBuilder extends PizzaBuilder {

    @Override
    public PizzaBuilder build() {
        createPizza();
        return this;
    }

    @Override
    public PizzaBuilder buildShape() {
        pizza.setShape("Japan Shape");
        return this;
    }

    @Override
    public PizzaBuilder buildSauce() {
        pizza.setSauce("Japan Sauce");
        return this;
    }

    @Override
    public PizzaBuilder buildDough() {
        pizza.setDough("Japan Dough");
        return this;
    }

    @Override
    public Pizza pizza() {
        return getPizza();
    }
}
