package part4;

public class A_Number_after_a_Double_Reversal {
	
	public static void main(String[] args) {
		int num = 1800;
		int rev1 = 0;
		int rev2 = 0;
		
		int temp = num;

	    while (temp > 0) 
	    {
				  rev1 = rev1 * 10 + temp % 10;
				  temp /= 10;
	    }
	    
	    System.out.println("----"+rev1);
	
	    while (rev1 > 0) 
	    {
				  rev2 = rev2 * 10 + rev1 % 10;
				  rev1 /= 10;
	    }
	    System.out.println("----"+rev2);

	    if(rev2==num) {
	    	System.out.println("True...");
	    }
	    
	    else {
	    	System.out.println("False...");
	    }
	    
	    
	}

}
