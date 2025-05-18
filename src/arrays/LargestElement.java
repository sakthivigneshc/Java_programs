package arrays;

public class LargestElement {
	
	public static void main(String[] args) {
		int [] numbers = {23, 66,55,6789,897};
		int largest = numbers[0];
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
		}
		System.out.println(largest);
	}

}
