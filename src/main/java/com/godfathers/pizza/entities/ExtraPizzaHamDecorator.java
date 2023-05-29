package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class ExtraPizzaHamDecorator extends ExtraPizzaDecorator{
    public ExtraPizzaHamDecorator(Pizza pizza){
        super("Ham",0.99, 35.0);
        this.decoratedPizza = pizza;
    }
    @Override
    public String getName() {
        return decoratedPizza.getName()+ " con extra Ham";
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
