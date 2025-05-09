import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

    private Coffee coffeeWithExtras;
    private Coffee coffeeWithoutExtras;
    private Coffee coffeeWithExtrasEqual;
    private Coffee coffeeWithoutExtrasEqual;

    @BeforeEach
    void setUp() {
        coffeeWithExtras = new Coffee("Cappuccino", Size.MEDIUM, true, true);
        coffeeWithoutExtras = new Coffee("Americano", Size.SMALL, false, false);
        coffeeWithExtrasEqual = new Coffee("Cappuccino", Size.MEDIUM, true, true);
        coffeeWithoutExtrasEqual = new Coffee("Americano", Size.SMALL, false, false);
    }

    @Test
    void testCalcPrice() {
        assertEquals(3.50, coffeeWithExtras.calcPrice(), 0.01);
        assertEquals(2.00, coffeeWithoutExtras.calcPrice(), 0.01);
    }

    @Test
    void testGetExtraShot() {
        assertTrue(coffeeWithExtras.getExtraShot());
        assertFalse(coffeeWithoutExtras.getExtraShot());
    }

    @Test
    void testGetExtraSyrup() {
        assertTrue(coffeeWithExtras.getExtraSyrup());
        assertFalse(coffeeWithoutExtras.getExtraSyrup());
    }
}
