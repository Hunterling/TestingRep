package interwiewPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import InterviewPractice.FirstNonRepeatingCharacter;

class FirstNonRepeatingCharacterTest {

	@Test
	void test() {
		
		String a = "abacabad";
		char solA = 'c';
		
		String b = "bcccccccb";
		char solB = '_';
		
		String c = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
		char solC = 'g';
		
		FirstNonRepeatingCharacter test = new FirstNonRepeatingCharacter();
		
		char check = test.firstNotRepeatingCharacter(a);
		
		
		if(check != solA)
			fail("Missed test a");

		if(test.firstNotRepeatingCharacter(b) != solB)
			fail("Missed test b");
		
		if(test.firstNotRepeatingCharacter(c) != solC)
			fail("Missed test c");
		
	}

}
