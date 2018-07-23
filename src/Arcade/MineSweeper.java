package Arcade;

public class MineSweeper {

	int[][] minesweeper(boolean[][] matrix) {
		int[][] mineCounter = new int[matrix.length][matrix[0].length];

		for (int y = 0; y < mineCounter.length; y++) {
			for (int x = 0; x < mineCounter[y].length; x++) {

				mineCounter[y][x] = this.countMines(matrix, y, x);

			}
		}

		return mineCounter;
	}

	private int countMines(boolean[][] image, int yPos, int xPos) {

		int sum = 0;

		for (int y = yPos - 1; y < yPos + 2; y++) {
			for (int x = xPos - 1; x < xPos + 2; x++) {

				boolean centerCheck = !(y == yPos && x == xPos);
				boolean borderCheck = y >= 0 && y < image.length && x >= 0 && x < image[y].length && centerCheck;
				// Checks for borders
				if (borderCheck && centerCheck) {

					if (image[y][x] == true)
						sum++;
				}
			}
		}
		return sum;
	}

}
