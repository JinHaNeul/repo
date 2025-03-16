import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	private GradeBook g1;
	private GradeBook g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(50);
		g1.addScore(75);
		
		g2.addScore(80);
		g2.addScore(90);
		g2.addScore(100);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() {
        assertTrue(g1.toString().equals("50.0 75.0 "));
        assertEquals(2, g1.getScoreSize());
    }
	
	@Test
	public void testSum() {
        assertEquals(125, g1.sum(), 0.0001);
        assertEquals(270, g2.sum(), 0.0001);
    }
	
	@Test
	public void testMinimum() {
        assertEquals(50, g1.minimum(), 0.0001);
        assertEquals(80, g2.minimum(), 0.0001);
    }
	
	@Test
	public void testFinalScore() {
        assertEquals(75, g1.finalScore(), 0.0001);
        assertEquals(190, g2.finalScore(), 0.0001);
    }
}
