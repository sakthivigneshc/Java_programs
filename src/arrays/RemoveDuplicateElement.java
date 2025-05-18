 package arrays;

public class RemoveDuplicateElement {
public static void main(String[] args) {
	int [] numbers = {23, 66, 66,66,77,77,897};
	int len = numbers.length;
	int [] result = new int[len];
	int index = 0;
	
	for(int i=0; i<len; i++) {
        if(i<numbers.length-1 && numbers[i] == numbers[i+1]){
              continue;
            }
            else{
                result[index] = numbers[i];
                index++;
            }
	}
	 
	for(int number : result) {
		System.out.println(number);
	}
    
}
}