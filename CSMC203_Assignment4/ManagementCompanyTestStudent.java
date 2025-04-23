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

public class ManagementCompanyTestStudent {
	Property studentProperty;
	ManagementCompany studentManagementCompany;
	
	@Before
	public void setUp() throws Exception {
		studentManagementCompany = new ManagementCompany("Mark", "ABCDEFG", 10);
	}
	
	@After
	public void tearDown() throws Exception {
		studentManagementCompany = null;
	}
	
	@Test
	public void testAddProperty() {
		studentProperty = new Property ("Global Defense Agency", "New York", 2592, "Cecil Stedman",1,3,5,4);
		assertEquals(studentManagementCompany.addProperty(studentProperty),0,0);
	}
	
	@Test
	public void testGetPropertiesCount() {
		studentProperty = new Property ("Global Defense Agency", "New York", 2592, "Cecil Stedman",1,3,5,4);
		assertEquals(studentManagementCompany.addProperty(studentProperty),0,0);
		assertEquals(studentManagementCompany.getPropertiesCount(), 1);
	}
	
	@Test
	public void testToString() {
		studentProperty = new Property ("Global Defense Agency", "New York", 2592, "Cecil Stedman",1,3,5,4);
		assertEquals(studentManagementCompany.addProperty(studentProperty), 0);
		String expectedString = "List of the properties for Mark, taxID: ABCDEFG\n"
				+ "______________________________________________________\n"
				+ "Global Defense Agency,New York,Cecil Stedman,2592.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 259.2";
		System.out.println(expectedString);
		System.out.println(studentManagementCompany.toString());
		assertEquals(expectedString, studentManagementCompany.toString());
	}
}