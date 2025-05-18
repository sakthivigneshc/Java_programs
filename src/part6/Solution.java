package part6;
class Solution {
    public static void removeDuplicates(int[] nums) {

        int count = 0;


        for(int i=0; i<nums.length ; i++){
            if(i<nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }
            else{
                nums[count] = nums[i];
                count++;
            }
        }

        for(int i=0; i<count; i++) {
        	System.out.println(nums[i]);
        }
        
        System.out.println("Value of count is : "+count);
        

    }
    
    public static void main(String[] args) {
		int [] nums = { 35,35,77,77,8};
		removeDuplicates(nums);
    	
	}
}


























