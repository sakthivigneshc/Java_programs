package part4;

import java.util.HashSet;

public class ContainsDuplicate {
	public static  boolean numArray(int[] numbers) {
		
		HashSet<Integer> resValues = new HashSet<Integer>();
		for(int value : numbers ) {
			if(resValues.contains(value)){
				return true;
			}
			resValues.add(value);
		}
		return false;
		
	}
	public static void main(String[] args) {
		
		int [] numbers  = { 1,2,3,1};
		
		if(numArray(numbers)) {
			System.out.println("This array contains duplicate number.");
		}
		else {
			System.out.println("This array not contains duplicate number.");
		}

		
		
	}
	
	
	

}

//lc