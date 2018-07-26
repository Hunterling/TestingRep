package InterviewPractice;

import java.util.ArrayList;

public class ConstructArray {

	
	public int[] constructArray(int size) {
	    
		int[] returnValue = new int[size];
	    int lowerValue = 1;
		
		
		for(int countUp = 0; countUp < returnValue.length;countUp++) {
			if(countUp % 2 == 0) {
				returnValue[countUp] = lowerValue++;
			}
			else {
				returnValue[countUp] = size--;
			}
			
		}
//		
//		for(int addHighNum = 1; addHighNum< returnValue.length;addHighNum += 2 ) {
//			returnValue[addHighNum] = size--;
//		}
//		
//
//		
//		for(int addLowNum = 0; addLowNum*2< returnValue.length;++addLowNum ) {
//			returnValue[addLowNum*2] = addLowNum+1;
//		}
//		
			    return returnValue;
	}

}
