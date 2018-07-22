//package diceRolls;
//
//public class DiceRolls {
//
//	public static void main(String[] args) {
//
//		// int[][] dice = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };
//		int[][] dice = { { 1, 2, 3, 4 }, { 2, 4, 6, 8 }, { 1, 3, 5, 7, 9 } };
//		int sum = 12;
//		DiceRolls test = new DiceRolls();
//
//		System.out.println(test.diceRolls(dice, sum));
//
//	}
//
//	int diceRolls(int[][] dice, int sum) {
//
//		int hits = 0;
//
//		for (int firstDice = 0; firstDice < dice.length; firstDice++) {
//			for (int firstNum : dice[firstDice]) {
//
//				int result = firstNum;
//
//				for (int nDice = 1; nDice < dice.length; nDice++) {
//					
//					for(int nDiceNum : dice[nDice]) {
//						
//						result += nDiceNum;
//						if(nDice != dice.length -1)
//							break;
//						else {
//							
//						}
//					}
//					
//				}
//				
//			}
//			
//		}
//		return hits;
//	}
//
//	private int goDeep(int[] test) {
//		
//	}
//}
