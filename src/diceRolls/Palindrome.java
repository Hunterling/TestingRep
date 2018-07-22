package diceRolls;

public class Palindrome {
	
	public static void main(String[] args) {
		String test = "abbcabb";
		Palindrome me = new Palindrome();
		
		me.palindromeRearranging(test);
	}


	boolean palindromeRearranging(String inputString) {

		
		
		
		char[] runOver  = inputString.toCharArray();
		int[] numberOfLetters = new int[26];

		for(int countLetters : runOver) {
		
		numberOfLetters[countLetters - 97]++;
		
		}
	
		boolean midLetter = false;
		
		for(int check : numberOfLetters) {
			if(check % 2 != 0) {
				if(midLetter)
					return false;
				midLetter = true;
			}
		}
		return true;
	}

}
