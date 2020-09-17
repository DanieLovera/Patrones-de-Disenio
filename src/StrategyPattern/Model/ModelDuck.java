package StrategyPattern.Model;

public class ModelDuck extends Duck {

    public ModelDuck () {
        super (new FlyNoWayStrategy(), new QuackStrategy());
    }

    public ModelDuck (FlyingStrategy flyingStrategy, QuackingStrategy quackingStrategy) {
        super (flyingStrategy, quackingStrategy);
    }

    @Override
    public void display() {
        System.out.println("It's a model duck");
    }
}
