package StrategyPattern.Model;

public class ReadheadDuck extends Duck {

    public ReadheadDuck (){
        super (new FlyWithWingsStrategy(), new QuackStrategy());
    }

    @Override
    public void display () {
        System.out.println("It's a ReadheadDuck");
    }
}
