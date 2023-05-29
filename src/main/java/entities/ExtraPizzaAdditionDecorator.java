package entities;

public abstract class ExtraPizzaAdditionDecorator  extends Pizza{
    protected Pizza pizza;

    public ExtraPizzaAdditionDecorator(Pizza pizza) {

        this.pizza = pizza;
    }

    @Override
    public abstract String getName();
    @Override
    public abstract Double getPrice();
    @Override
    public abstract Double getCalories();
}
