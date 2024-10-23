package com.example.Pizza.Decorator;

import com.example.Pizza.BasePizza;

public class ExtraCheeseDecorator implements ToppingDecorator {
  BasePizza basePizza;

    public ExtraCheeseDecorator(BasePizza basePizza) {
      this.basePizza = basePizza;
    }

    @Override
    public int cost() {
      return basePizza.cost() + 20;
    }
}
