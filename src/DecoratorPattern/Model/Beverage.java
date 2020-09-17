package DecoratorPattern.Model;

public abstract class Beverage {

    private float cost;
    private String description;
    private static final String DEFAULT_DESCRIPTION = "Unknown";
    private static final float DEFAULT_COST = 0.80f;

    public Beverage () {
        this (DEFAULT_COST, DEFAULT_DESCRIPTION);
    }

    public Beverage (float cost) {
        this (cost, DEFAULT_DESCRIPTION);
    }

    public Beverage (String description) {
        this (DEFAULT_COST, description);
    }

    public Beverage (float cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public float cost () {
        return cost;
    }

    public String getDescription () {
        return description;
    }

    @Override
    public String toString() {
        return "Beverage: " + getDescription () + "\nCost = " + cost () + " $";
    }
}
