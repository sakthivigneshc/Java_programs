package part3;

public class CustomSortingInArray {
public static void main(String[] args) {
	
	// Sort the element with out using Arrays.sort()
	
	int arrayInput[]  = {2,19,4,98,5};
	for(int i=0; i<arrayInput.length;i++) {
		for(int j=i+1; j<arrayInput.length;j++)
		{
			if(arrayInput[i] > arrayInput[j]) 
			{
			int temp = arrayInput[i];
			arrayInput[i] = arrayInput[j];
			arrayInput[j] =temp;
			}
		}
	}
	
	for(int val : arrayInput) {
		System.out.print(val+" ");
	}
	
}
}
