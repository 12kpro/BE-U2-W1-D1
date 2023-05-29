package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public abstract class Consumation {
    String name;
    Double price;
    Double calories;

    public Consumation(String name, Double price, Double calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}
