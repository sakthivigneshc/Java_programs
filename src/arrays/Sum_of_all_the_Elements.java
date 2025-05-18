package arrays;

public class Sum_of_all_the_Elements {

	public static void main(String[] args) {
		int[] numbers = {23,45,6,7};
		int sumOfElements = 0;
		for(int i=0; i< numbers.length; i++) {
			sumOfElements  += numbers[i];
		}
		
		System.out.println(sumOfElements);
	}
}
