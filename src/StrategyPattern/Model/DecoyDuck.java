package StrategyPattern.Model;

public class DecoyDuck extends Duck {

    public DecoyDuck () {
        super (new FlyNoWayStrategy(), new MuteQuackStrategy());
    }

    @Override
    public void display () {
        System.out.println("It's a DecoyDuck");
    }
}
