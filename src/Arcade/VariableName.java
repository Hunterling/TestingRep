package Arcade;

public class VariableName {

	boolean variableName(String name) {

		String lettersNoDigitsUnderscore = "[a-zA-Z_]";
		String lettersDigitsUnderscore = "[a-zA-Z0-9_]+";
		String firstLetter = name.substring(0, 1);

		boolean first = firstLetter.matches(lettersNoDigitsUnderscore);
		boolean second = name.matches(lettersDigitsUnderscore);
		
		if (first &&second )
			return true;
		return false;
	}

}
