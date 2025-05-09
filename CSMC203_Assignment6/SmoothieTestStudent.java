import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {

    private Smoothie smoothieWithProtein;
    private Smoothie smoothieWithoutProtein;
    private Smoothie smoothieWithProteinEqual;
    private Smoothie smoothieWithoutProteinEqual;

    @BeforeEach
    void setUp() {
        smoothieWithProtein = new Smoothie("Strawberry Blast", Size.LARGE, 3, true);
        smoothieWithoutProtein = new Smoothie("Mango Magic", Size.SMALL, 1, false);
        smoothieWithProteinEqual = new Smoothie("Strawberry Blast", Size.LARGE, 3, true);
        smoothieWithoutProteinEqual = new Smoothie("Mango Magic", Size.SMALL, 1, false);
    }

    @Test
    void testToString() {
        String expectedWithProtein = "Strawberry Blast, LARGE, Protein Added: true, Number of Fruits: 3, Price: $6.00";
        String expectedWithoutProtein = "Mango Magic, SMALL, Protein Added: false, Number of Fruits: 1, Price: $2.50";
        assertEquals(expectedWithProtein, smoothieWithProtein.toString());
        assertEquals(expectedWithoutProtein, smoothieWithoutProtein.toString());
    }

    @Test
    void testCalcPrice() {
        assertEquals(6.00, smoothieWithProtein.calcPrice(), 0.01);
        assertEquals(2.50, smoothieWithoutProtein.calcPrice(), 0.01);
    }

    @Test
    void testGetNumOfFruits() {
        assertEquals(3, smoothieWithProtein.getNumOfFruits());
        assertEquals(1, smoothieWithoutProtein.getNumOfFruits());
    }

    @Test
    void testGetAddProtein() {
        assertTrue(smoothieWithProtein.getAddProtein());
        assertFalse(smoothieWithoutProtein.getAddProtein());
    }
}