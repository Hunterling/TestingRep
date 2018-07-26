package interwiewPractice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import InterviewPractice.ConstructArray;

class ConstructArrayTest {

	@Test
	void test() {
		int a=7;
		int[] solA = {1, 7, 2, 6, 3, 5, 4};
		int b = 2;
		int[] solB = {1,2};
		int c = 1;
		int[] solC = {1};
		
		ConstructArray test = new ConstructArray();
		
		if(!this.checkArrays(test.constructArray(a), solA))
			fail("Missed test a");
			if(!this.checkArrays(test.constructArray(b), solB))
			fail("Missed test b");
			if(!this.checkArrays(test.constructArray(c), solC))
			fail("Missed test c");
		
	}

	
	private boolean checkArrays(int[] a, int[] b) {

		for (int countY = 0; countY < a.length; countY++) {
				if (a[countY] != b[countY]) {
					return false;
				}
		}
		return true;
	}
}
