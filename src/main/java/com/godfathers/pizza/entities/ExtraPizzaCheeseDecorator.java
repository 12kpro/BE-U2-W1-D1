package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class ExtraPizzaCheeseDecorator extends ExtraPizzaDecorator{
    public ExtraPizzaCheeseDecorator(Pizza pizza){
        super("Cheese",0.69, 92.0);
        this.decoratedPizza = pizza;
    }
    @Override
    public String getName() {
        return decoratedPizza.getName()+ " con extra Cheese";
    }
    @Override
    public Double getPrice() {
        return decoratedPizza.getPrice() + this.getPrice();
    }
    @Override
    public Double getcalories() {
        return decoratedPizza.getCalories() + + this.getCalories();
    }
}
