package Arcade;

public class ElemToReplace {

	int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {

		for(int place = 0; place < inputArray.length;place++) {
			if(inputArray[place] == elemToReplace)
				inputArray[place] = substitutionElem;
		}
		
		return inputArray;
	}

}
