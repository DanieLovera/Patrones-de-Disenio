package DecoratorPattern.Model;

public class Espresso extends Beverage {

    public static final String DESCRIPTION = "Espresso";
    public static final float COST = 1.99f;

    public Espresso() {
        super (COST, DESCRIPTION);
    }

    public Espresso(float cost) {
        super (cost, DESCRIPTION);
    }
}
