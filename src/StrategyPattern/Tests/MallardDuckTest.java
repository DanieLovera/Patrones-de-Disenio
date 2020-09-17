package StrategyPattern.Tests;

import StrategyPattern.Model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MallardDuckTest {

    private Duck mallardDuck;

    @BeforeEach
    public void setUpMallardDuck () {
        mallardDuck = new MallardDuck();
    }

    @Test
    public void test01MallardDuckFlyLikeANormalDuck () {
        FlyingStrategy flyWithWingsStrategy = new FlyWithWingsStrategy();
        assertEquals(flyWithWingsStrategy.fly(), mallardDuck.fly());
    }

    @Test
    public void test02MallardDuckQuackLikeANormalDuck () {
        QuackingStrategy quackingStrategy = new QuackStrategy();
        assertEquals(quackingStrategy.quack(), mallardDuck.quack());
    }
}
