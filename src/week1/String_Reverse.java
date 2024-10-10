package week1;

public class String_Reverse {
	
	public static void main(String[] args) {
		String  city= "America";
		String reverseCity ="";
		int wordLength = city.length();
		System.out.println("The String before reversed : "+city);
		
		for(int i=wordLength-1; i>=0; i-- ) {
			char ch = city.charAt(i);
			reverseCity = reverseCity + ch;
		}
		System.out.println("The String after reversed : "+reverseCity);
	}

}


