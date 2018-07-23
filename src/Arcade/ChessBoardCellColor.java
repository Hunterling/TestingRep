package Arcade;

public class ChessBoardCellColor {

	
	boolean chessBoardCellColor(String cell1, String cell2) {

		if(!this.checkString(cell1) || !this.checkString(cell2))
			return false;
		
		char[] c1 = cell1.toCharArray();
		char[] c2 = cell2.toCharArray();
		
		int c1Color = ((c1[0] % 2) + (c1[1] % 2)) % 2;
		int c2Color = ((c2[0] % 2) + (c2[1] % 2)) % 2;
		
		if(c1Color == c2Color)
			return true;
		return false;
		
	}

	private boolean checkString(String test) {
		String letterRegex = "[a-zA-Z]";
		String numberRegex = "[0-9]";
		
		String letter = test.substring(0, 1);
		String number = test.substring(1,2);
		
		if(letter.matches(letterRegex) && number.matches(numberRegex))
			return true;
		return false;
		
	}
	
}
