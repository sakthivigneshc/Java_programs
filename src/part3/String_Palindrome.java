package part3;

public class String_Palindrome {

	public static void main(String[] args) {
		
		/*  //	Whether the given string is palindrome or not
		   	Input  : radar
		   	Output : This string is a palindrome
		 */
		
		String word = "radar";//12345
		String reverse ="";
		int length = word.length();
//		System.out.println(length-1); 
		for(int i=length-1; i>=0;i--) {
//			System.out.print(i);
			reverse = reverse+word.charAt(i);
		}
//		System.out.println(reverse);
		if(word.equals(reverse)) {
			System.out.println("This string is a palindrome.");
		}
		else {
			System.out.println("This string is not a palindrome.");
		}
	}    
}




