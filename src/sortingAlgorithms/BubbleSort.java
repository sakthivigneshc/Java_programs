package sortingAlgorithms;

public class BubbleSort {
public static void main(String[] args) {
	int arr[] = {3453, 89876, 294, 5200, 2009876, 9};
    int n = arr.length;
    System.out.println("Before selection sort:");

    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    bubble_Sort(arr, n);
    
    
    
}

private static void bubble_Sort(int[] arr, int n) {
		for(int i=0; i<n; i++)//Number of passes 
			{
			for(int j=0; j<n-i-1; j++)//iterationsf
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("After buuble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

	
	
	
}
}



// On each pass the largest will be at the end. 

/* 
arr = 4,2,1,5,3
 pass 1 -> 2 1 4 3 5
 pass 2 -> 1 2 3 4 5
 pass 3 -> 1 2 3 4 5
 pass 4 -> 1 2 3 4 5
 
 passes -> n-1 df
*/