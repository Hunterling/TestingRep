package quickTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ConstructSubmatrix {

		int[][] constructSubmatrix(int[][] matrix, int[] rowsToDelete, int[] columnsToDelete) {
	
			ArrayList<Integer> rowToDelete = new ArrayList<Integer>();
			ArrayList<Integer> columnToDelete = new ArrayList<Integer>();
	
			for (int add : rowsToDelete) {
				rowToDelete.add(add);
			}
			for (int add : columnsToDelete) {
				columnToDelete.add(add);
			}
	
			int[][] newMatrix = new int[matrix.length - rowsToDelete.length][matrix[0].length - columnsToDelete.length];
	
			int newRow = 0;
			for (int rows = 0; rows < matrix.length; rows++) {
	
				int newCol = 0;
	
				if (!rowToDelete.contains(rows)) {
					for (int columns = 0; columns < matrix[rows].length; columns++) {
	
						if (!columnToDelete.contains(columns)) {
							newMatrix[newRow][newCol] = matrix[rows][columns];
							newCol++;
						}
	
					}
					newRow++;
				}
			}
	
			return newMatrix;
	
		}

}
