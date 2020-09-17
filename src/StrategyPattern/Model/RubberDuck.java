package StrategyPattern.Model;

public class RubberDuck extends Duck{

    public RubberDuck () {
        super (new FlyNoWayStrategy(), new SqueakStrategy());
    }

    @Override
    public void display () {
        System.out.println("It's a RubberDuck");
    }
}
