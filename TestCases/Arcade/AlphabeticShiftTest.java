package Arcade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabeticShiftTest {

	@Test
	void test() {
		String z = "z";
		String solZ = "a";
		
		AlphabeticShift test = new AlphabeticShift();
		String b = test.alphabeticShift(z);
		
		
		if(!test.alphabeticShift(solZ).equals(b))
			fail("Not a");
	}

}
