package DecoratorPattern.Tests;

import DecoratorPattern.Model.Mocha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MochaTests {

    @Test
    public void Test01SeCreaUnMochaConReferenciaNulaYDevuelveNullPointerException () {
        assertThrows(NullPointerException.class,() -> new Mocha(null));
    }
}
