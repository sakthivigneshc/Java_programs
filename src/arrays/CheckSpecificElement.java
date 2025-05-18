package arrays;

public class CheckSpecificElement {
public static void main(String[] args) {
	int [] numbers = {23, 5, 6,789};
	int element  = 6;
	boolean found = false;
	for(int i=0; i<numbers.length;i++) {
		if(element == numbers[i]) {
			found = true;
			break;
		}
	}
	if(found) {
		System.out.println(element+ " is present in the array");
	}
	else {
		System.out.println("There is no such element in the array");
	}
}
}
