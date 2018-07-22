package Arcade;

import java.util.Arrays;

public class AvoidObstacles {

	int avoidObstacles(int[] inputArray) {

		Arrays.sort(inputArray);

		int lastNumChecked = 1;
		if (inputArray[0] == 0) {
			return -1;
		}
		
		for (int nextObstacle = 0; nextObstacle < inputArray.length; nextObstacle++) {

			for (int divideBy = lastNumChecked + 1; divideBy < inputArray[nextObstacle]; divideBy++) {

				boolean noDivisor = true;

				for (int divideNum = nextObstacle; divideNum < inputArray.length; divideNum++) {
					if (inputArray[divideNum] % divideBy == 0) {
						noDivisor = false;
						break;
					}
				}
				if (noDivisor) {
					return divideBy;
				}

			}

			lastNumChecked = inputArray[nextObstacle];
		}

		return lastNumChecked + 1;
	}

}
