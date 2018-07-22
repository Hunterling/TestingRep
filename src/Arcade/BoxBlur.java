package Arcade;

public class BoxBlur {

	int[][] boxBlur(int[][] image) {

		int[][] blurred = new int[image.length-2][image[0].length-2];
		
		for(int y = 0; y < blurred.length;y++) {
			for(int x= 0; x<blurred[y].length;x++) {
				
				blurred[y][x] = this.blurr(image, y+1, x+1);
				
			}
		}
		
	return blurred;
	}
	

	private int blurr(int[][] image,int yPos, int xPos) {
		
		int sum = 0;
		
		for(int y = yPos - 1;y < yPos+2;y++) {
			for(int x = xPos - 1; x < xPos + 2;x++) {
				sum += image[y][x];
			}
		}
		return sum / 9;
	}
	
	
}
