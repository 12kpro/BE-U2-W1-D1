package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class Drink extends  Consumation{
    public Drink(String name, Double price, Double calories) {
        super(name, price, calories);
    }
}
