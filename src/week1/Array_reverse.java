package week1;

//import java.util.Arrays;

public class Array_reverse {
	
	public static void main(String[] args) {
		int arr []  = {1,2,3,4,5};
		int length = arr.length;
	
		int start = 0;
		int end = length-1;
		int temp;
		
         while(start<end) {
        	 temp = arr[start];
        	 arr[start] = arr[end];
        	 arr[end] = temp;
        	 start++;
        	 end--;
        	 
         }
//     System.out.println(Arrays.toString(arr));
//     [5, 4, 3, 2, 1]
         
         for(int element : arr) {
        	 System.out.print(element+" ");
         }
         
         
       
		
		
		
		
	}

}
