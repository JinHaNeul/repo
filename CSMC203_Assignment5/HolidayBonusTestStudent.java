/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: Testing the program that processes ragged 2D arrays of sales data to calculate various statistics and determine holiday bonuses based on highest, lowest, and other values within each column.
 * Due: 04/08/2025
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jin Ha Neul
*/
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestStudent {

	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8,9}};
	
	private double[][] dataSet2 = {{7,2,9,4},{5},{8,1,3},{11,6,7,2}};
	
	private double[][] dataSet3 = {{7.2,2.5,9.3,4.8},{5.9},{8.1,1.7,3.3},{11.6,6.9,7.3,2.7}};

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonus1() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(3000.0, result[0], .001);
			assertEquals(4000.0, result[1], .001);
			assertEquals(20000.0, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}
	
	@Test
	public void testCalculateHolidayBonus2() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet2);
			assertEquals(14000.0, result[0], .001);
			assertEquals(1000.0, result[1], .001);
			assertEquals(4000.0, result[2], .001);
			assertEquals(13000.0, result[3], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}
	
	@Test
	public void testCalculateHolidayBonus3() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet3);
			assertEquals(14000.0, result[0], .001);
			assertEquals(1000.0, result[1], .001);
			assertEquals(4000.0, result[2], .001);
			assertEquals(13000.0, result[3], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}

	@Test
	public void testCalculateTotalHolidayBonus1() {
		assertEquals(27000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
	}
	
	@Test
	public void testCalculateTotalHolidayBonus2() {
		assertEquals(32000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet2), .001);
	}
	
	@Test
	public void testCalculateTotalHolidayBonus3() {
		assertEquals(32000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet3), .001);
	}

}