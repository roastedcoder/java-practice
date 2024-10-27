package com.example;

import com.example.Pizza.Decorator.ExtraCheeseDecorator;
import com.example.Pizza.Decorator.MushroomDecorator;
import com.example.Pizza.VegDelight;

public class Main {
    public static void main(String[] args) {
        VegDelight vegDelight = new VegDelight();
        System.out.println("Cost of Veg Delight Pizza: " + vegDelight.cost());

        MushroomDecorator mushroomDecorator = new MushroomDecorator(vegDelight);
        System.out.println("Cost of Veg Delight Pizza with Mushroom: " + mushroomDecorator.cost());

        ExtraCheeseDecorator extraCheeseDecorator = new ExtraCheeseDecorator(mushroomDecorator);
        System.out.println("Cost of Veg Delight Pizza with Mushroom and Extra Cheese: " + extraCheeseDecorator.cost());
    }
}