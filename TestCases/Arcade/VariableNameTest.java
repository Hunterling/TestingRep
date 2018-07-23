package Arcade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VariableNameTest {

	@Test
	void test() {
		String a = "var_1__Int";
		
		VariableName test = new VariableName();
		
		if(!test.variableName(a))
			fail("Wrong answer in String a");
	}

}
