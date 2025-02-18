package part5;

import java.util.Arrays;

public class MoveAllZerosToLeft {
	
public static void main(String[] args) {
	// By creating a new array
	int[] arrayValues = {2,4,0,8,2,0};
	int arraySize = arrayValues.length;
	int newArray [] = new int[arraySize];
	
	if(arraySize==0) {
		System.out.println(arrayValues);
	}
	
	
	for(int number : arrayValues) {
		if(number!=0 ) {
			
			newArray[arraySize-1] = number;
			arraySize--;

		}
	}
	
	System.out.println(Arrays.toString(newArray));
	
	/* 
	 input  : [2,4,0,8,2,0]
	 Output : [0, 0, 2, 8, 4, 2]

	 */
	
}
}

//same kind of qn: 283. Move Zeroes (Leetcode)