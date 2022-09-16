package githubExercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	@Test
	public void intCompareTest() {
		
		int result1 = Main.intCompare(3,1);
		assertEquals(1,result1);
		
		int result2 = Main.intCompare(1,3);
		assertEquals(2,result2);
		
		int result3 = Main.intCompare(1,1);
		assertEquals(3,result3);
	}
	


}
