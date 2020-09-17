package StrategyPattern.Model;

public class MallardDuck extends Duck{

    public MallardDuck(){
        super (new FlyWithWingsStrategy(), new QuackStrategy());
    }

    @Override
    public void display () {
        System.out.println("It's a MallarDuck");
    }
}
