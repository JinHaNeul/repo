import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {

    private Alcohol alcoholWeekend;
    private Alcohol alcoholWeekday;
    private Alcohol alcoholWeekendEqual;
    private Alcohol alcoholWeekdayEqual;

    @BeforeEach
    void setUp() {
        alcoholWeekend = new Alcohol("Beer", Size.MEDIUM, true);
        alcoholWeekday = new Alcohol("Wine", Size.SMALL, false);
        alcoholWeekendEqual = new Alcohol("Beer", Size.MEDIUM, true);
        alcoholWeekdayEqual = new Alcohol("Wine", Size.SMALL, false);
    }

    @Test
    void testToString() {
        String expectedWeekend = "Beer, MEDIUM, Weekend: true, Price: $3.10";
        String expectedWeekday = "Wine, SMALL, Weekend: false, Price: $2.00";
        assertEquals(expectedWeekend, alcoholWeekend.toString());
        assertEquals(expectedWeekday, alcoholWeekday.toString());
    }

    @Test
    void testCalcPrice() {
        assertEquals(2.0, alcoholWeekday.calcPrice(), 0.01);
        assertEquals(3.1, alcoholWeekend.calcPrice(), 0.01);
    }

    @Test
    void testIsWeekend() {
        assertTrue(alcoholWeekend.isWeekend());
        assertFalse(alcoholWeekday.isWeekend());
    }
}
