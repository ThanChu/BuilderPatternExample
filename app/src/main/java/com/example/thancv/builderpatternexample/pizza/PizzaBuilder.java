package com.example.thancv.builderpatternexample.pizza;

/**
 * Created by ThanCV on 8/8/2017.
 */

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createPizza() {
        this.pizza = new Pizza();
    }

    public abstract PizzaBuilder build();

    public abstract PizzaBuilder buildShape();

    public abstract PizzaBuilder buildSauce();

    public abstract PizzaBuilder buildDough();

    public abstract Pizza pizza();

}
