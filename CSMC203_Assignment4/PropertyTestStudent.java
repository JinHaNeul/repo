/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: A JUnit test for a program where ManagementCompany class manages multiple Property objects, each defined by a name, location, rent, owner, and a Plot, while ensuring properties fit within its own Plot without overlap and calculating total rental income and management fees.
 * Due: 04/22/2025
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming  assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Jin Ha Neul
*/
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyTestStudent {
	Property propertyTwo;
	
	@BeforeEach
	void setUp() throws Exception {
		propertyTwo = new Property("Property DEF", "Germantown", 3600.00, "Bank Of America", 5, 5, 2, 2);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		propertyTwo = null;
	}
	
	@Test
	void testGetPropertyName() {
		assertEquals("Property DEF", propertyTwo.getPropertyName());
	}
	
	@Test
	void testGetRentAmount() {
		assertEquals(3600.00, propertyTwo.getRentAmount());
	}
	
	@Test
	void testGetPlot() {
		assertEquals(5, propertyTwo.getPlot().getX());
		assertEquals(5, propertyTwo.getPlot().getY());
		assertEquals(2, propertyTwo.getPlot().getWidth());
		assertEquals(2, propertyTwo.getPlot().getDepth());
	}
	
	@Test
	void testToString() {
		assertEquals("Property DEF,Germantown,Bank Of America,3600.0",propertyTwo.toString());
	}
}