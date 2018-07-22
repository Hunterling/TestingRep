package diceRolls;

public class EquallyStrong {

	public static void main(String[] args)
	{
		EquallyStrong test = new EquallyStrong();
		System.out.println(test.areEquallyStrong(15,10,15,9));
	}
	
	boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
	
		int leftEqualTo = (yourLeft == friendsLeft) ? 0 : (yourLeft == friendsRight) ? 1 : -1;
		
		if(leftEqualTo == 0 &&
				yourRight == friendsRight)
			return true;

		if(leftEqualTo == 1 &&
				yourRight == friendsLeft)
			return true;
		
		return false;
	}
	
}
