package quickTasks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructSubmatrixTest {

	@Test
	void test() {
		
		int[][] a = {{1,0,0,2}, 
		    {0,5,0,1}, 
		    {0,0,3,5}};
		
		int[] rowA = {1};
		int[] colA=	{0, 2};
	
		int[][] solA = {{0,2}, 
		                {0,5}};		
				
				
	ConstructSubmatrix test = new ConstructSubmatrix();
		
		
		if(!this.checkArrays(test.constructSubmatrix(a, rowA, colA), solA))
			fail("Missed test a");
	
	
	}
	
	
	private boolean checkArrays(int[][] a, int[][] b) {

		for (int countY = 0; countY < a.length; countY++) {
			for (int countX = 0; countX < a[countY].length; countX++) {
				if (a[countY][countX] != b[countY][countX]) {
					return false;
				}
			}
		}
		return true;
	}
}
