package entities;

public abstract class ExtraPizzaAdditionDecorator extends Pizza {
    protected Pizza pizza;

    public ExtraPizzaAdditionDecorator(String name) {
        super(name);
    }

    @Override
    public abstract String getName();
}
