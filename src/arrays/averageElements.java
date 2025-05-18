package arrays;

public class averageElements {
	public static void main(String[] args) {
		int [] numbers = {34,4,56,7};
		int sumOfElements = 0;
		for(int i=0; i< numbers.length; i++) {
			sumOfElements  += numbers[i];
		}
		double AverageOfNumbers =(double)sumOfElements/numbers.length; 
		System.out.println(AverageOfNumbers);
	}

}
