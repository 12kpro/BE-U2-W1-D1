package entities;

public class ExtraPizzaCheeseDecorator extends ExtraPizzaAdditionDecorator{
    public ExtraPizzaCheeseDecorator(Pizza pizza){
        super();
        this.pizza = pizza;
    }
    @Override
    public String getName() {
        return pizza.getName() + "extra cheese";
    }
    @Override
    public Double getPrice() {
        return pizza.getPrice() + 0.69;
    }
    @Override
    public Double getCalories() {
        return pizza.getCalories() + 92.0;
    }
}
