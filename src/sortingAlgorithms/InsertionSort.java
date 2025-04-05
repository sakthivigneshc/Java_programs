package sortingAlgorithms;

public class InsertionSort {
	
	public static void main(String[] args) {
		int [] numbers  = {8,4,21,1};
		System.out.print("Elements before sorting ");
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		insertionSort(numbers);
		System.out.print("Elements after sorting ");

		for(int number : numbers) {
			System.out.print(number + " ");
		}
	}

	private static void insertionSort(int[] numbers) {

			for(int i=1;i<numbers.length; i++) {
				
				int j= i-1;
				int current = numbers[i];
				
				while(j>=0  && numbers[j]> current) {
					numbers[j+1] = numbers[j]; // shifting right
					j--;
				}
				
				numbers[j+1] = current;			
				
				
			}
		
	}

}
