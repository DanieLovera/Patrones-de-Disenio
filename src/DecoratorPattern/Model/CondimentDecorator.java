package DecoratorPattern.Model;

public abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;
    private static final Beverage DEFAULT_BEVERAGE = new Espresso();
    private static final String DEFAULT_DESCRIPTION = "Unknown";
    private static final float DEFAULT_COST = 0.25f;

    public CondimentDecorator () {
        this (DEFAULT_BEVERAGE);
    }

    public CondimentDecorator (Beverage beverage) {
        this (beverage,DEFAULT_COST, DEFAULT_DESCRIPTION);
    }

    public CondimentDecorator (Beverage beverage
            , float additionalCost, String description) {
        super (beverage.cost() + additionalCost
                , beverage.getDescription() + " " + description);

        this.beverage = beverage;
    }
}
