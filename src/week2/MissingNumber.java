package week2;
public class MissingNumber {
    public static int missingNumber(int []a, int N) {
        // Write your code here.

   int len = N;
    int total =len*(len+1)/2;
   
//    System.out.println(total);
    int sum =0;

    for(int i=0; i<=a.length-1; i++){

        sum = sum+a[i];

    }

    return total -sum;


    }
    public static void main(String[] args) {
    	int a[] = {1,2,3};
		int N = 4 ;
		int number = missingNumber(a , N);
		System.out.println("Missing number is : "+number);	
		}
}



//CN

