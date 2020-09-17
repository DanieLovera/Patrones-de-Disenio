package DecoratorPattern.Model;

public class HouseBlend extends Beverage {

    public static final String DESCRIPTION = "HouseBlendCoffee";
    public static final float COST = 0.89f;

    public HouseBlend () {
        super (COST, DESCRIPTION);
    }

    public HouseBlend (float cost) {
        super (cost, DESCRIPTION);
    }
}
