package reverseEngineering;

public class RoadSigns {

	String roadSigns(String[] sign) {

		String[][] inWords = new String[sign.length][];

		int biggest = 0;
		int count = 0;
		for (String addMe : sign) {
			inWords[count] = addMe.split(" ");
			if (inWords[count].length > biggest) {
				biggest = inWords[count].length;
			}
			count++;
		}

		String output = "";
		boolean upperCase = true;
		for (int createSign = 0; createSign < biggest; createSign++) {

			for (int rounding = 0; rounding < inWords.length; rounding++) {
				String appEnd ="";
				if (createSign < inWords[rounding].length) {
					appEnd = inWords[rounding][createSign].toLowerCase();
				
				if (upperCase) {
					output += appEnd.substring(0, 1).toUpperCase() + appEnd.substring(1) + " ";
					upperCase = false;
				} else {
					output += appEnd + " ";
				}
				char lastChar = appEnd.charAt(appEnd.length() - 1);
				if (lastChar == '!' || lastChar == '?' || lastChar == '.')
					upperCase = true;
				}
	
			}

		}
		output = output.replace(" !", "!").replace(" ?", "?").replace(" .", ".").replace(" ,", ",");
		
		return output.trim();
	}
//		rawOutput = rawOutput.replace(" !", "!").replace(" ?", "?").replace(" .", ".").replace(" ,", ",");
//		rawOutput = rawOutput.replace("!", "! ").replace("?", "? ").replace(".", ". ").replace(",", ", ");
//		rawOutput = rawOutput.replace("  ", " ").trim().toLowerCase();
//
//		String[] splitter = rawOutput.split(" ");
//
//		String output = "";
//		boolean beginSentence = true;
//		for (String oneWord : splitter) {
//			if (beginSentence) {
//				output += oneWord.substring(0, 1).toUpperCase() + oneWord.substring(1) + " ";
//				beginSentence = false;
//			} else {
//				output += oneWord + " ";
//			}
//
//			char lastChar = oneWord.charAt(oneWord.length() - 1);
//			if (lastChar == '!' || lastChar == '?' || lastChar == '.')
//				beginSentence = true;
//
//		}
//
//		return output.trim();
//	}
	
}
