package InterviewPractice;


public class FirstNonRepeatingCharacter {

	
	public char firstNotRepeatingCharacter(String s) {
		
		s = s.toLowerCase();
		
		while(s.length() > 0) {
			char test = s.charAt(0) ;
			int formerLength = s.length();
			s = s.replace(Character.toString(test), "");
			int count = formerLength - s.length();
			if(count  == 1)
				return test;
		}
		
		return '_';
	}

}
