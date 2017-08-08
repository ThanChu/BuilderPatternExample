package com.example.thancv.builderpatternexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.thancv.builderpatternexample.pizza.Pizza;
import com.example.thancv.builderpatternexample.pizza.PizzaBuilder;
import com.example.thancv.builderpatternexample.pizza.VietnamPizzaBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //User user = new User.Builder().name("Than").age("25").address("Hanoi").build();

        //String s = new User.Builder().name("Than").age("25").address("Hanoi").showInformation();
//        User user = new User();
//        UserBuilder builder = new UserBuilder(user).build().name("ThanCV").age("20").address("Hanoi");
//        Log.e("ddddddddddd", user.getName());
//        Log.e("aaaaaaaaaaa", builder.toString());

        PizzaBuilder pizzaBuilder = new VietnamPizzaBuilder().build().buildShape();
        //Pizza pizza = pizzaBuilder.pizza();
        Pizza pizza = pizzaBuilder.getPizza();

        Log.e("aaaaaaaaaaa", pizza.getShape() + "\n");
    }
}
