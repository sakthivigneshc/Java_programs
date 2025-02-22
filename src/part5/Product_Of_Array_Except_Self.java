package part5;

public class Product_Of_Array_Except_Self {
	  public static int[] productExceptSelf(int[] nums) {
		  int [] firstArray = new int [nums.length];
		  int [] secondArray = new int [nums.length];

		  firstArray[0]=1;
		  secondArray[nums.length-1]=1;
		  for(int i=1; i<nums.length;i++) {
			  firstArray[i] = firstArray[i-1]*nums[i-1];
		  }
		  
		     for(int i= nums.length-2; i>=0; i--) {
		    	 secondArray[i] = secondArray[i+1]*nums[i+1];
		  }
		     
		     int ans [] = new int [nums.length];
		  for(int i=0; i<=nums.length-1;i++) {
			  ans[i] = firstArray[i] * secondArray [i];
		  }
		return ans;

	    
  }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int [] consoleArray =  productExceptSelf(nums);
		for(int consoleValue : consoleArray) {
			System.out.print(consoleValue + " ");
		}
			
	}

}
