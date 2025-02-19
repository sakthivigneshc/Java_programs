package part5;

import java.util.HashMap;

public class TwoSumQn {
	
	 public static int[] twoSum(int[] nums, int target) {
		 
        HashMap< Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length;i++) {
			int num1 =  target - nums[i];
			if(map.containsKey(num1)) {
				int [] newarr =  new int[] {map.get(num1),i};
                return newarr;
			}
			map.put(nums[i], i);	
		}
		return null;  

	 }
	        
	public static void main(String[] args) {
		
		int [] nums = {2,7,11,15};
		twoSum(nums, 9);
	}

}


//1. Two Sum
//D2