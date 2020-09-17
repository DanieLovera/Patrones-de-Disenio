package StrategyPattern.Model;

public class MuteQuackStrategy implements QuackingStrategy {

    public String quack(){
        return "No quacking";
    }
}
