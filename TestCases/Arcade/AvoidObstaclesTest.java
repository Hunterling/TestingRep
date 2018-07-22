package Arcade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AvoidObstaclesTest {

	@Test
	void test() {
		
		AvoidObstacles test = new AvoidObstacles();
		int[] a = { 3, 5, 6, 7, 9 };
		int[] b = {2,3};
		int[] c = {1,4,10,6,2};
		int[] d = {1000,999};
		int[] e = {19,32,23,11};
		int[] f = {5,8,9,13,14};
		
		
		
		if(test.avoidObstacles(a) != 4)
			fail("Test A missed");
		if(test.avoidObstacles(b) != 4)
			fail("Test B missed");
		if(test.avoidObstacles(c) != 7)
			fail("Test C missed");
		if(test.avoidObstacles(d) != 6)
			fail("Test D missed");
		if(test.avoidObstacles(e) != 3)
			fail("Test E missed");
		if(test.avoidObstacles(f) != 6)
			fail("Test F missed");
		
		
	}

}
