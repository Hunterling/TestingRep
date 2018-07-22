package diceRolls;

public class AbsoluteMaximum {
	
	
	public static void main(String[] args)
	{
		AbsoluteMaximum test = new AbsoluteMaximum();
	int[] arr = {10,11,13};
		
		System.out.println(test.arrayMaximalAdjacentDifference(arr));
	
	}
	
	int arrayMaximalAdjacentDifference(int[] inputArray) {

		int last = inputArray[0];
		int biggest = 0;
		for(int count : inputArray) {
			int check = count - last;
			if(check < 0)
				check *= -1;
			
			if(check > biggest) {
				biggest = check;
			}
			last = count;
		}
		
		
		return biggest;
	}


}
