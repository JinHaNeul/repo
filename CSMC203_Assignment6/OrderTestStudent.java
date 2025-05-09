import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTestStudent {
    Order orderOne, orderTwo, orderThree, orderFour;

    @Before
    public void setUp() throws Exception {
        orderOne = new Order(15, Day.WEDNESDAY, new Customer("Alex", 30));
        orderTwo = new Order(9, Day.FRIDAY, new Customer("Linda", 28));
        orderThree = new Order(18, Day.THURSDAY, new Customer("Sam", 35));
    }

    @After
    public void tearDown() throws Exception {
        orderOne = orderTwo = orderThree = null;
    }

    @Test
    public void testGetBeverage4() {
        Coffee cf = new Coffee("Cappuccino", Size.LARGE, true, true);
        Alcohol al = new Alcohol("Tequila", Size.MEDIUM, false);
        Smoothie sm1 = new Smoothie("Mango Blast", Size.SMALL, 2, true);
        Smoothie sm2 = new Smoothie("Berry Delight", Size.MEDIUM, 3, false);

        orderOne.addNewBeverage("Cappuccino", Size.LARGE, true, true);
        orderOne.addNewBeverage("Tequila", Size.MEDIUM);
        orderOne.addNewBeverage("Mango Blast", Size.SMALL, 2, true);

        assertTrue(orderOne.getBeverage(0).equals(cf));
        assertTrue(orderOne.getBeverage(1).equals(al));
        assertTrue(orderOne.getBeverage(2).equals(sm1));
        assertFalse(orderOne.getBeverage(2).equals(sm2));
    }

    @Test
    public void testAddNewBeverage5() {
        assertTrue(orderTwo.getTotalItems() == 0);
        
        orderTwo.addNewBeverage("Cappuccino", Size.SMALL, true, false);
        assertTrue(orderTwo.getBeverage(0).getType().equals(Type.COFFEE)); 
        
        orderTwo.addNewBeverage("Tequila", Size.LARGE);
        assertTrue(orderTwo.getBeverage(1).getType().equals(Type.ALCOHOL)); 
        
        orderTwo.addNewBeverage("Berry Delight", Size.MEDIUM, 3, false);
        assertTrue(orderTwo.getBeverage(2).getType().equals(Type.SMOOTHIE)); 
        
        assertTrue(orderTwo.getTotalItems() == 3);
    }

    @Test
    public void testCalcOrderTotal6() {
        orderOne.addNewBeverage("Cappuccino", Size.LARGE, true, true);
        orderOne.addNewBeverage("Tequila", Size.MEDIUM);
        orderOne.addNewBeverage("Mango Blast", Size.SMALL, 2, true);

        assertEquals(11, orderOne.calcOrderTotal(), .01); 
        
        orderThree.addNewBeverage("Latte", Size.MEDIUM, true, true);
        orderThree.addNewBeverage("Whiskey", Size.LARGE);
        orderThree.addNewBeverage("Tropical Fusion", Size.LARGE, 4, false);

        assertEquals(11.5, orderThree.calcOrderTotal(), .01); 
    }
}