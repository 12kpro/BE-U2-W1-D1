package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Slf4j
@ToString
//@Component
public class Pizza extends  Consumation{
    public Pizza(String name) {
        super(name, 4.99, 1104.0);
    }
}
