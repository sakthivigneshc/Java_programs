package part4;

public class SmallestNumberInAnArray {

	public static void main(String[] args) {
		int numbers[] = { 23, 45, 37, 1, 6, 90 };
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		System.out.println(min);

	}

}
