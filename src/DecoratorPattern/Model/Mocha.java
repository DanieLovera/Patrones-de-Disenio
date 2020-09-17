package DecoratorPattern.Model;

public class Mocha extends CondimentDecorator {

    public static final String DESCRIPTION = "Mocha";
    public static final float COST = 0.20f;

    public Mocha () {
        super ();
    }

    public Mocha (Beverage beverage) {
        super (beverage,COST,DESCRIPTION);
    }

    public Mocha (Beverage beverage, float additional_cost) {
        super(beverage,additional_cost,DESCRIPTION);
    }
}
