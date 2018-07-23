package Arcade;

public class AlphabeticShift {

	String alphabeticShift(String inputString) {

		char[] shifter = inputString.toCharArray();

		for (int count = 0; count < inputString.length(); count++) {
			char toShift = shifter[count];

			if (toShift == 'z' || toShift == 'Z') {
				toShift -= 25;
				shifter[count] = toShift;
			} else {
				toShift++;
				shifter[count] = toShift;
			}
		}
		
		
		String ret = "";
		for(char addUp : shifter) {
			ret += addUp;
		}
		
		return ret;
	}

}
