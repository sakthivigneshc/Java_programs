package arrays;

public class CountSpecificElement {
public static void main(String[] args) {
	int [] numbers = {23, 66, 66,66};
	int element  = 66;
	int count = 0;
	for(int i=0; i<numbers.length;i++) {
		if(element == numbers[i]) {
			count++;
		}
	}
	System.out.println(count);
}
}