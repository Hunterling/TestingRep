package InterviewPractice;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
	
	int firstDuplicate(int[] a) {

		Set<Integer> uniqueInts = new HashSet<Integer>(a.length,1);
		
		for(int uniqueNum = 0; uniqueNum < a.length; uniqueNum++) {
			if(!uniqueInts.add(a[uniqueNum])) return a[uniqueNum];
		}
		
		return -1;
		
	}


}
