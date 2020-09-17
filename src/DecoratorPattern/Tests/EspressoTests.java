package DecoratorPattern.Tests;

import DecoratorPattern.Model.Beverage;
import DecoratorPattern.Model.Espresso;
import DecoratorPattern.Model.Mocha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EspressoTests {

    @Test
    public void Test01SeCreaUnEspressoYSeObtieneSuEstadoPorDefecto () {
        Beverage espresso = new Espresso ();
        String description = Espresso.DESCRIPTION;
        float cost = Espresso.COST;
        assertEquals(espresso.getDescription(), description);
        assertEquals(espresso.cost(), cost);
    }

    @Test
    public void Test02SeCreaUnEspressoConPrecioDeterminadoYSeObtieneSuEstado () {
        float cost = 1.55f;
        Beverage espresso = new Espresso (cost);
        String description = Espresso.DESCRIPTION;
        assertEquals(espresso.getDescription(), description);
        assertEquals(espresso.cost(), cost);
    }
}
