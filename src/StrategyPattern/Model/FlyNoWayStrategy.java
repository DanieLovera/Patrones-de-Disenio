package StrategyPattern.Model;

public class FlyNoWayStrategy implements FlyingStrategy{

    public String fly() {
        return "No flying";
    }
}
