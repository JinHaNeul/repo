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
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlotTestStudent {
	private Plot plot2, plot3, plot4;
	
	@Before
	public void setUp() throws Exception {
		plot2 = new Plot(5, 5, 3, 3);
		plot3 = new Plot(6, 3, 5, 6);
		plot4 = new Plot(1, 1, 1, 1);
	}
	
	@After
	public void tearDown() throws Exception {
		plot2 = plot3 = plot4 = null;
	}
	
	@Test
	public void testOverlaps() {
		assertTrue(plot2.overlaps(plot3));
		assertFalse(plot2.overlaps(plot4));
	}
	
	@Test
	public void testToString() {
		assertEquals("5,5,3,3",plot2.toString());
		assertEquals("6,3,5,6",plot3.toString());
		assertEquals("1,1,1,1",plot4.toString());
	}
}