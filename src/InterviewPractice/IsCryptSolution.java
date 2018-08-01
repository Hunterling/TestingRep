package InterviewPractice;

import org.omg.CORBA.portable.ValueBase;

public class IsCryptSolution {

	public boolean isCryptSolution(String[] crypt, char[][] solution) {

		String letters = "";
		int[] numbers = new int[solution.length];

		for (int count = 0; count < solution.length; count++) {
			letters += solution[count][0];
			numbers[count] = solution[count][1] -48;
		}

		int valueFirstWord = this.decypherWord(crypt[0], letters, numbers);
		int valueSecondWord = this.decypherWord(crypt[1], letters, numbers);
		int valueSolutionWord = this.decypherWord(crypt[2], letters, numbers);

		if (valueFirstWord != -1 && valueSecondWord != -1 && valueFirstWord + valueSecondWord == valueSolutionWord)
			return true;
		return false;
	}

	private int decypherWord(String word, String letters, int[] numbers) {

		int overhead = (int) Math.pow(10, word.length()-1);
		int returnValue = 0;
		boolean leadingZero = false;
		
		for (char letter : word.toCharArray()) {
			returnValue += numbers[letters.indexOf(letter)] * overhead;
			overhead /= 10;
			if(returnValue == 0 ) {
				if(leadingZero)
					return -1;
				leadingZero = true;
			}
		}

		if(leadingZero && returnValue != 0)
			return -1;
		else
			return returnValue;
	}
}
