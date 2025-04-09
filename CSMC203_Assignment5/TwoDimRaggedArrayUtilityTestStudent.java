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

public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8,9}};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		assertEquals(45.0,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
	}
	
	@Test
	public void testGetAverage() {
		assertEquals(5.0,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
	}
	
	@Test
	public void testGetRowTotal1() {
		assertEquals(6.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,0),.001);
	}
	
	@Test
	public void testGetRowTotal2() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}
	
	@Test
	public void testGetRowTotal3() {
		assertEquals(30.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,2),.001);
	}
	
	@Test
	public void testGetColumnTotal1() {
		assertEquals(11.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,0),.001);
	}
	
	@Test
	public void testGetColumnTotal2() {
		assertEquals(14.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,1),.001);
	}
	
	@Test
	public void testGetColumnTotal3() {
		assertEquals(11.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,2),.001);
	}
	
	@Test
	public void testGetColumnTotal4() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,3),.001);
	}
	
	@Test
	public void testGetHighestInRow1() {
		assertEquals(3.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,0),.001);
	}
	
	@Test
	public void testGetHighestInRow2() {
		assertEquals(5.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,1),.001);
	}
	
	@Test
	public void testGetHighestInRow3() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,2),.001);
	}
	
	@Test
	public void testGetHighestInRowIndex1() {
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,0),.001);
	}
	
	@Test
	public void testGetHighestInRowIndex2() {
		assertEquals(1,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,1),.001);
	}
	
	@Test
	public void testGetHighestInRowIndex3() {
		assertEquals(3,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,2),.001);
	}
	
	@Test
	public void testGetLowestInRow1() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInRow(dataSet1,0),.001);
	}
	
	@Test
	public void testGetLowestInRow2() {
		assertEquals(4.0,TwoDimRaggedArrayUtility.getLowestInRow(dataSet1,1),.001);
	}
	
	@Test
	public void testGetLowestInRow3() {
		assertEquals(6.0,TwoDimRaggedArrayUtility.getLowestInRow(dataSet1,2),.001);
	}
	
	@Test
	public void testGetLowestInRowIndex1() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1,0),.001);
	}
	
	@Test
	public void testGetLowestInRowIndex2() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1,1),.001);
	}
	
	@Test
	public void testGetLowestInRowIndex3() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1,2),.001);
	}
	
	@Test
	public void testGetHighestInColumn1() {
		assertEquals(6.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1,0),.001);
	}
	
	@Test
	public void testGetHighestInColumn2() {
		assertEquals(7.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1,1),.001);
	}
	
	@Test
	public void testGetHighestInColumn3() {
		assertEquals(8.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1,2),.001);
	}
	
	@Test
	public void testGetHighestInColumn4() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1,3),.001);
	}
	
	@Test
	public void testGetHighestInColumnIndex1() {
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1,0),.001);
	}
	
	@Test
	public void testGetHighestInColumnIndex2() {
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1,1),.001);
	}
	
	@Test
	public void testGetHighestInColumnIndex3() {
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1,2),.001);
	}
	
	@Test
	public void testGetHighestInColumnIndex4() {
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1,3),.001);
	}
	
	@Test
	public void testGetLowestInColumn1() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,0),.001);
	}
	
	@Test
	public void testGetLowestInColumn2() {
		assertEquals(2.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,1),.001);
	}
	
	@Test
	public void testGetLowestInColumn3() {
		assertEquals(3.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,2),.001);
	}
	
	@Test
	public void testGetLowestInColumn4() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,3),.001);
	}
	
	@Test
	public void testGetLowestInColumnIndex1() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,0),.001);
	}
	
	@Test
	public void testGetLowestInColumnIndex2() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,1),.001);
	}
	
	@Test
	public void testGetLowestInColumnIndex3() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,2),.001);
	}
	
	@Test
	public void testGetLowestInColumnIndex4() {
		assertEquals(2,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,3),.001);
	}
	
	@Test
	public void testGetHighestInArray() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),.001);
	}
	
	@Test
	public void testGetLowestInArray() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),.001);
	}
}