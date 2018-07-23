package Arcade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChessBoardCellColorTest {

	@Test
	void test() {


		String cell1= "A1";
		String	cell2= "C3";
		
		ChessBoardCellColor test = new ChessBoardCellColor();
		
		boolean check = test.chessBoardCellColor(cell1, cell2);
	
		if(!check)
			fail("Failed");
	}

}
