package DecoratorPattern.Model;

public class TestDecoratorPattern {

    public static void main (String arg []) {

        Beverage espresso = new Espresso();
        System.out.println(espresso);

        Beverage espressoMocha = new Mocha(espresso);
        System.out.println(espressoMocha);

        Beverage espressoMochaMocha = new Mocha(espressoMocha);
        System.out.println(espressoMochaMocha);
    }
}
