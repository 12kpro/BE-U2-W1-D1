package com.godfathers.pizza.config;

import com.godfathers.pizza.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean("margherita")
    Pizza margherita() {
        return new Pizza("Margherita");
    }
}
