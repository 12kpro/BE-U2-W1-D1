package com.godfathers.pizza;

import com.godfathers.pizza.entities.Pizza;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class PizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaApplication.class, args);
		menu();
	}
	public static void menu() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PizzaApplication.class);
		//ctx.scan("com.godfathers.pizza");
		//ctx.refresh();
		///Pizza margherita = ctx.getBean(Pizza.class);
		log.info(ctx.getBean("margherita").toString());
		//log.info(margherita.toString());

		ctx.close();
	}
}
