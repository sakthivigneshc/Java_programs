package arrays;

public class SecondLargest {
	
	public static void main(String[] args) {
		int [] numbers = {23, 66,55,6789,6789};
		int largest = numbers[0];
		int secondLargest = numbers[1];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				secondLargest = largest;
				largest = numbers[i];
			}
			else if(numbers[i]>secondLargest && numbers[i]!=largest)
			{
				secondLargest = numbers[i];
			}
			}
		System.out.println(secondLargest);
	
	
	
	
	
	
	}

}
