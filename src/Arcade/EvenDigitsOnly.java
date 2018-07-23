package Arcade;

public class EvenDigitsOnly {

	boolean evenDigitsOnly(int n) {

		while(n > 0) {
			int substitute = n - ((n / 10) *10);
			
			if(!(substitute % 2 == 0))
				return false;
			
			n /= 10; 
		}
		return true;
	}

}
