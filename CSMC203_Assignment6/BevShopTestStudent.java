import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {

    private BevShop bevShop;

    @BeforeEach
    void setUp() {
        bevShop = new BevShop();
        bevShop.startNewOrder(10, Day.MONDAY, "John", 25);
    }

    @Test
    void testIsValidTime() {
        assertTrue(bevShop.isValidTime(8));
        assertFalse(bevShop.isValidTime(7));
        assertTrue(bevShop.isValidTime(23));
        assertFalse(bevShop.isValidTime(24));
    }

    @Test
    void testGetMaxNumOfFruits() {
        assertEquals(5, bevShop.getMaxNumOfFruits());
    }

    @Test
    void testIsMaxFruit() {
        assertFalse(bevShop.isMaxFruit(3));
        assertTrue(bevShop.isMaxFruit(6));
    }

    @Test
    void testIsValidAge() {
        assertTrue(bevShop.isValidAge(22));
        assertFalse(bevShop.isValidAge(20));
    }

    @Test
    void testStartNewOrderAndGetCurrentOrder() {
        assertEquals("John", bevShop.getCurrentOrder().getCustomer().getName());
    }

    @Test
    void testProcessAlcoholOrderLimit() {
        bevShop.processAlcoholOrder("Beer", Size.SMALL);
        bevShop.processAlcoholOrder("Wine", Size.MEDIUM);
        bevShop.processAlcoholOrder("Vodka", Size.LARGE);
        bevShop.processAlcoholOrder("Rum", Size.MEDIUM);
        assertEquals(3, bevShop.getNumOfAlcoholDrink());
    }


    @Test
    void testFindOrder() {
        int orderNo = bevShop.getCurrentOrder().getOrderNo();
        assertEquals(0, bevShop.findOrder(orderNo));
    }

    @Test
    void testTotalOrderPrice() {
        bevShop.processCoffeeOrder("Mocha", Size.MEDIUM, true, false);
        double price = bevShop.getCurrentOrder().calcOrderTotal();
        assertEquals(price, bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
    }

    @Test
    void testTotalMonthlySaleAndOrderCount() {
        bevShop.processCoffeeOrder("Mocha", Size.MEDIUM, true, false);
        assertEquals(1, bevShop.totalNumOfMonthlyOrders());
        assertTrue(bevShop.totalMonthlySale() > 0);
    }

    @Test
    void testGetOrderAtIndex() {
        assertNotNull(bevShop.getOrderAtIndex(0));
        assertNull(bevShop.getOrderAtIndex(-1));
        assertNull(bevShop.getOrderAtIndex(99));
    }
}
