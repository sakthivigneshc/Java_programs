package week2;

public class SequenceExpander {
	public static void main(String[] args) {
		String qn  ="a2b3c1";
		
		for(int i=0; i<qn.length(); i++) {
//			int ch =qn.charAt(i); if used this it will print those characters ASCII value.\
			// a is 97 2 is 50 ....
//			System.out.println(ch);

		if(Character.isAlphabetic(qn.charAt(i))) {
			  System.out.print(qn.charAt(i));
		}
		else {
			int x = Character.getNumericValue(qn.charAt(i));
			for(int j=1; j<x; j++) {
				System.out.print(qn.charAt(i-1));
			}
		}
		
		}
	}

}















