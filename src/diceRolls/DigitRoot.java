package diceRolls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitRoot {

	public static void main(String[] args) {
		DigitRoot test = new DigitRoot();
		int[] aa =  {2, 1, 3, 5, 3, 2};
		System.out.println(test.firstDuplicate(aa));
	}
	
	
	int firstDuplicate(int[] a) {
		
		int firstDupli = a.length;
		for(int countFirst = 0;countFirst < firstDupli; countFirst++) {
			int first = a[countFirst];
			
			for(int countSecond = countFirst+1; countSecond< firstDupli; countSecond++) {
				if(first == a[countSecond])
				{
					firstDupli = countSecond;
				}
			}
			
			
		}
		
		if(firstDupli == a.length)
			return -1;
		else
			return a[firstDupli];
	}

	
	int[] digitRootSort(int[] a) {

		List<Integer> converted = new ArrayList<Integer>();
		int[] position = new int[a.length];
		
		int conversion = 0;
		for(int count = 0; count < a.length; count++) {
			int convertToDigit = a[count];
			
			do {
				
				conversion += convertToDigit - (convertToDigit % 10) * 10;
				convertToDigit %= 10;
			}
			while(convertToDigit > 10);
		
		converted.add(conversion);
		position[count] = conversion;
		}
		
		Collections.sort(converted);
		
		for(int count = 0; count < a.length; count++) {

			
		}
		
		return a;
	}
	

}
