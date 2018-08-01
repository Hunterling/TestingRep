package interwiewPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import InterviewPractice.SudokuSolver;

class SudokuSolverTest {

	@Test
	void test() {
		char[][] a = {	{'.','.','.','1','4','.','.','2','.'}, 
						{'.','.','6','.','.','.','.','.','.'}, 
						{'.','.','.','.','.','.','.','.','.'}, 
						{'.','.','1','.','.','.','.','.','.'}, 
						{'.','6','7','.','.','.','.','.','9'}, 
						{'.','.','.','.','.','.','8','1','.'}, 
						{'.','3','.','.','.','.','.','.','6'}, 
						{'.','.','.','.','.','7','.','.','.'}, 
						{'.','.','.','5','.','.','.','7','.'}};
	
		
		SudokuSolver test = new SudokuSolver();
		
		if(test.sudoku2(a) != true) {
			fail("Missed testcase A");
		}
	}

}
