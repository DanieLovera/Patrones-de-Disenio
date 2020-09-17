package StrategyPattern.Model;

public class TestStrategyPattern {

    public static void main (String args[]){

        Duck mallardDuck = new MallardDuck();
        System.out.println(mallardDuck.quack());
        System.out.println(mallardDuck.fly());
        mallardDuck.swin();
        mallardDuck.display();

        Duck modelDuck = new ModelDuck();
        System.out.println(modelDuck.fly());
        modelDuck.setFlyingStrategy(new FlyWithWingsStrategy());
        System.out.println(modelDuck.fly());
        modelDuck.display();
    }
}
