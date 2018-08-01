package InterviewPractice;

public class SudokuSolver {

	char[][] grid;

public 	boolean sudoku2(char[][] grid) {
		this.grid = grid;

		for (int zeile = 0; zeile < 9; zeile++) {
			for (int spalte = 0; spalte < 9; spalte++) {

				char wert = grid[zeile][spalte];
				grid[zeile][spalte] = '.';
				if (wert != '.') {

					if (!isZeileOk(zeile, wert)) {
						return false;
					}
					if (!isSpalteOk(spalte, wert)) {
						return false;
					}

					if (!isBlockOk(zeile, spalte, wert)) {
						return false;
					}

				}
				grid[zeile][spalte] = wert;
			}
		}
		return true;
	}

	private boolean isZeileOk(int zeile, char wert) {

		for (int countRow = 0; countRow < grid.length; countRow++) {
			if (grid[zeile][countRow] == wert) {
				return false;
			}
		}
		return true;
	}

	private boolean isSpalteOk(int spalte, char wert) {
		for (int countColumn = 0; countColumn < grid[spalte].length; countColumn++) {
			if (grid[countColumn][spalte] == wert) {
				return false;
			}
		}
		return true;
	}

	private boolean isBlockOk(int zeile, int spalte, char wert) {
		int rowBlock = (zeile / 3) * 3;
		int columnBlock = (spalte / 3) * 3;

		for (int countBlock = 0; countBlock < 9; countBlock++) {

			int row = countBlock % 3 + rowBlock;
			int column = countBlock / 3 + columnBlock;

			if (grid[row][column] == wert) {
				return false;
			}

		}

		return true;
	}

}
