package dailyChallenges;

public class CelsiusVsFahrenheit {


	int celsiusVsFahrenheit(int[] yourTemps, int[] friendsTemps) {
		
		int daysHotterInPalau = 0;
		
		for(int count = 0; count < yourTemps.length; count++) {
			double myTempInFahrenheit = yourTemps[count] * 1.8 + 32;
			
			if(friendsTemps[count] > myTempInFahrenheit)
				daysHotterInPalau++;
		}
		
		return daysHotterInPalau;
	}

	
}
