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
		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ctx.scan("com.godfathers.pizza");
		//ctx.refresh();
		//Pizza margherita = ctx.getBean(Pizza.class);
		//margherita.setName("margherita");
		log.info(ctx.getBean("margherita").toString());
		log.info(ctx.getBean("hawaiian").toString());
		log.info(ctx.getBean("salami").toString());
		log.info((String) ctx.getBean("cheeseextra"));
		log.info((String) ctx.getBean("hamextra"));
		log.info((String) ctx.getBean("onionsextra"));
		log.info((String) ctx.getBean("pineappleextra"));
		log.info((String) ctx.getBean("salamiextra"));
		log.info(ctx.getBean("lemonade").toString());
		log.info(ctx.getBean("water").toString());
		log.info(ctx.getBean("wine").toString());
		log.info(ctx.getBean("shirts").toString());
		log.info(ctx.getBean("mug").toString());
		//log.info(margherita.toString());

		ctx.close();
	}
}
