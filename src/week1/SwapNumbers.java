package week1;

public class SwapNumbers {
	/*
	  Swap two numbers with out using temporary variable.
	
	 */
	
public static void main(String[] args) {
	int a =6;
	int b =9;
	
	System.out.println("Numbers before swapping : " +a +" "+b);

	
	a = a+b; // 15
	b = a-b; // 15-9 6
	a = a -b; //15-6 9
	
  
	//  another way of swapping the two elements with out using the temporary variable.
	  
    /*
 	 a= a*b;  // a=54
	 b=a/b ;   // b= 54/9 =6
	 a=a/b ;  // a = 54/6 = 9
	 
	 */
	 
		 
	System.out.println("Numbers after swapping : " +a +" "+b);

	
	
}
}
