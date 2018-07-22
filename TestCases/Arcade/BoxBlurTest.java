package Arcade;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BoxBlurTest {

	@Test
	void test() {

		int[][] a = new int[][] { { 1, 1, 1 }, { 1, 7, 1 }, { 1, 1, 1 } };
		int[][] aSol = new int[][] {{1}};
		int[][] b = new int[][] { { 0, 18, 9 }, { 27, 9, 0 }, { 81, 63, 45 } };
		int[][] bSol= new int[][] {{28}};
		int[][] c = new int[][] { { 36, 0, 18, 9 }, { 27, 54, 9, 0 }, { 81, 63, 72, 45 } };
		int[][] cSol= new int[][] {{40,30}};
		int[][] d = new int[][] { { 7, 4, 0, 1 }, { 5, 6, 2, 2 }, { 6, 10, 7, 8 }, { 1, 4, 2, 0 } };
		int[][] dSol = new int[][] {{5,4},{4,4}};
		int[][] e = new int[][] { { 36, 0, 18, 9, 9, 45, 27 }, { 27, 0, 54, 9, 0, 63, 90 }, { 81, 63, 72, 45, 18, 27, 0 },
				{ 0, 0, 9, 81, 27, 18, 45 }, { 45, 45, 27, 27, 90, 81, 72 }, { 45, 18, 9, 0, 9, 18, 45 },
				{ 27, 81, 36, 63, 63, 72, 81 } };
		int[][] eSol = new int[][] {{39,30,26,25,31}, 
		                {34,37,35,32,32}, 
		                {38,41,44,46,42}, 
		                {22,24,31,39,45}, 
		                {37,34,36,47,59}};
		BoxBlur testObject = new BoxBlur();
		int[][] checkMe = testObject.boxBlur(a);
		if(!checkArrays(checkMe,  aSol))
			fail("Failed at testcase a");

		if(!checkArrays(testObject.boxBlur(b),  bSol))
			fail("Failed at testcase b");

		if(!checkArrays(testObject.boxBlur(c),  cSol))
			fail("Failed at testcase c");

		if(!checkArrays(testObject.boxBlur(d) , dSol))
			fail("Failed at testcase d");

		if(!checkArrays(testObject.boxBlur(e) ,  eSol))
			fail("Failed at testcase e");
	}

	private boolean checkArrays(int[][] a, int[][] b) {
		
		for(int countY = 0; countY< a.length; countY++) {
			for(int countX = 0; countX< a[countY].length; countX++) {
				if(a[countY][countX] != b[countY][countX]) {
					return false;
				}
			}
		}
		return true;
	}
}
