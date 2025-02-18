package part4;

public class ExtractNumbersFromStringAndAdd {
	// apple34
	public static void main(String[] args) {
		
		String value = "apple34";
		int digits = 0;
		for(int i=0; i<value.length();i++) {
			char ch =  value.charAt(i);
			if(Character.isDigit(ch)) {
				digits += Character.getNumericValue(ch);
			}
		}
		System.out.println(digits);
		
	}

}
