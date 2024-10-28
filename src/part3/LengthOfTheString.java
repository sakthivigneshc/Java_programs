package part3;


/*
 
  Print the length of the string with out using length() method of the string.
 
 */

public class LengthOfTheString {
	public static void main(String[] args) {
		String a = "Eclipse_Software";
		int count = 0;
		char [] countOfTheCharacters = a.toCharArray();
		for(char ch : countOfTheCharacters) {
			count++;
		}
		
		System.out.println("The length of the string is : "+count);
	}

}
//LAO
