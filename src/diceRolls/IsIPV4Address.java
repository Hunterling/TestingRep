package diceRolls;

public class IsIPV4Address {

	public static void main(String[] args) {
		IsIPV4Address test = new IsIPV4Address();
		int[] a = { 2, 1, 4, 4, 1, 4, 4, 1, 2, 0, 1, 0, 0, 3, 1, 3, 4, 1, 3, 4 };

		System.out.println(test.zigzag(a));
	}

	int zigzag(int[] a) {

		int size = 0;
		int biggest = 1;
		int next = a[1];
		int last = a[1];
		for (int checkMe = 0; checkMe < a.length; checkMe++) {

			int checking = a[checkMe];

			int lower = checking - last;
			int upper = checking - next;
			if (checkMe + 2 < a.length) {
				next = a[checkMe + 2];
			} else {
				next = last;
			}

			if ((lower < 0 && upper < 0) || (lower > 0 && upper > 0)) {
				size++;
			} else {
				if (checkMe + 1 < a.length)
					size++;

				if (size > biggest) {
					biggest = size;
				}
				size = 1;

			}
			last = checking;

		}
		return biggest;
	}

	boolean isIPv4Address(String inputString) {

		String[] counterCheck = inputString.split("\\.");

		if (counterCheck.length != 4) {
			return false;
		}

		boolean outOfRange = false;

		for (String testNum : counterCheck) {
			int checkMe = 0;

			try {
				checkMe = Integer.parseInt(testNum);
			} catch (NumberFormatException notANumber) {
				return false;
			}

			if (checkMe < 0 || checkMe > 255) {
				outOfRange = true;
			}

		}
		return !outOfRange;
	}

}
