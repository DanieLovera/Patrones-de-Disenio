package DecoratorPattern.Model;

public class Whip extends CondimentDecorator{

    public static final String DESCRIPTION = "Whip";
    public static final float COST = 0.10f;

    public Whip () {
        super ();
    }

    public Whip (Beverage beverage) {
        super (beverage,COST,DESCRIPTION);
    }

    public Whip (Beverage beverage, float additional_cost) {
        super(beverage,additional_cost,DESCRIPTION);
    }

    @Override
    public float cost () {
        return  super.cost() + getBeverage().cost();
    }
}
