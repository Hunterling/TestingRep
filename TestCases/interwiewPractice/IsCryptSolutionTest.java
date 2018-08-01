package interwiewPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import InterviewPractice.IsCryptSolution;

class IsCryptSolutionTest {

	@Test
	void test() {

		String[] cryptA = { "SEND", "MORE", "MONEY" };
		char[][] solA = { { 'O', '0' }, { 'M', '1' }, { 'Y', '2' }, { 'E', '5' }, { 'N', '6' }, { 'D', '7' },
				{ 'R', '8' }, { 'S', '9' } };

		String[] cryptB = { "TEN", "TWO", "ONE" };
		char[][] solB = { { 'O', '1' }, { 'T', '0' }, { 'W', '9' }, { 'E', '5' }, { 'N', '4' } };

		String[] cryptC = {"AA","AA","AA"};
		char[][] solC = {{'A','0'}};
		
		IsCryptSolution test = new IsCryptSolution();

		if (!test.isCryptSolution(cryptA, solA))
			fail("Missed testcase A.");
		if (test.isCryptSolution(cryptB, solB))
			fail("Missed testcase B.");
		if (test.isCryptSolution(cryptC, solC))
			fail("Missed testcase C.");
	
	}

}
