package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class ExtraPizzaPineAppleDecorator extends ExtraPizzaDecorator{
    public ExtraPizzaPineAppleDecorator(Pizza pizza){
        super("PineApple",0.79, 24.0);
        this.decoratedPizza = pizza;
    }
    @Override
    public String getName() {
        return decoratedPizza.getName()+ " con extra PineApple";
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
