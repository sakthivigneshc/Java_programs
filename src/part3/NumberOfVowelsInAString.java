package part3;

public class NumberOfVowelsInAString {
	
	public static void main(String[] args) {
		String name = "Sakthi";
		char ch[] = name.toCharArray();
	     int count = 0;
	     name = name.toLowerCase();
		for(char charValue : ch) {
			if('a' == charValue || 'e' == charValue || 'i' == charValue || 'o' == charValue || 'u' == charValue){
			    count++;
			} 
		}
		
		System.out.println("Your name have "+ count + " vowel(s)");

	}

}
