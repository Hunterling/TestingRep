package Arcade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MineSweeperTest {

	@Test
	void test() {
		boolean[][] a = { { true, false, false }, { false, true, false }, { false, false, false } };
		int[][] solA = { { 1, 2, 1 }, { 2, 1, 1 }, { 1, 1, 1 } };

		boolean[][] b = { { false, false, false }, { false, false, false } };
		int[][] solB = { { 0, 0, 0 }, { 0, 0, 0 } };

		boolean[][] c = { { true, false, false, true }, { false, false, true, false }, { true, true, false, true } };
		int[][] solC = { { 0, 2, 2, 1 }, { 3, 4, 3, 3 }, { 1, 2, 3, 1 } };

		boolean[][] d = { { true, true, true }, { true, true, true }, { true, true, true } };
		int[][] solD = { { 3, 5, 3 }, { 5, 8, 5 }, { 3, 5, 3 } };

		boolean[][] e = { { false, true, true, false }, { true, true, false, true }, { false, false, true, false } };
		int[][] solE = { { 3, 3, 3, 2 }, { 2, 4, 5, 2 }, { 2, 3, 2, 2 } };

		MineSweeper test = new MineSweeper();

		if (!checkArrays(test.minesweeper(a), solA))
			fail("Failed at testcase a");

		if (!checkArrays(test.minesweeper(b), solB))
			fail("Failed at testcase b");

		if (!checkArrays(test.minesweeper(c), solC))
			fail("Failed at testcase c");

		if (!checkArrays(test.minesweeper(d), solD))
			fail("Failed at testcase d");

		if (!checkArrays(test.minesweeper(e), solE))
			fail("Failed at testcase e");
	}

	private boolean checkArrays(int[][] a, int[][] b) {

		for (int countY = 0; countY < a.length; countY++) {
			for (int countX = 0; countX < a[countY].length; countX++) {
				if (a[countY][countX] != b[countY][countX]) {
					return false;
				}
			}
		}
		return true;
	}

}
