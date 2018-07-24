package InterviewPractice;

public class RotateImage {

	public int[][] rotateImage(int[][] matrix) {

		for (int depth = 0; depth < (matrix.length + 1) / 2; depth++) {

			//int innerLength = (matrix.length + 1) / 2 - depth;
			int innerCorners = matrix.length - (depth+1);

			for (int rotate = 0; rotate < matrix.length - (depth*2 +1); rotate++) {
				int temp = matrix[depth+rotate][depth];

				matrix[depth + rotate][depth] = matrix[innerCorners][depth+rotate];
				int test = matrix[innerCorners-rotate][innerCorners];
				matrix[innerCorners][depth+rotate] = matrix[innerCorners-rotate][innerCorners];
				matrix[innerCorners-rotate][innerCorners] = matrix[depth][innerCorners-rotate];
				matrix[depth][innerCorners-rotate] = temp;

			}
		}
		return matrix;
	}

}
