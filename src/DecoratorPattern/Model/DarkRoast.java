package DecoratorPattern.Model;

public class DarkRoast extends Beverage{

    public static final String DESCRIPTION = "DarkRoast";
    public static final float COST = 0.99f;

    public DarkRoast() {
        super (COST, DESCRIPTION);
    }

    public DarkRoast (float cost) {
        super (cost, DESCRIPTION);
    }
}
