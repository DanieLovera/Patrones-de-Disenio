package StrategyPattern.Model;

public abstract class Duck {

    private FlyingStrategy flyingStrategy;
    private QuackingStrategy quackingStrategy;

    public Duck (FlyingStrategy flyingStrategy, QuackingStrategy quackingStrategy) {
        this.flyingStrategy = flyingStrategy;
        this.quackingStrategy = quackingStrategy;
    }

    public String fly () {
        return flyingStrategy.fly();
    }

    public String quack () {
        return quackingStrategy.quack();
    }

    public void swin () {
        System.out.println("All ducks float, even decoys!");
    }

    public void setQuackingStrategy(QuackingStrategy quackingStrategy) {
        this.quackingStrategy = quackingStrategy;
    }

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    public abstract void display();
}
