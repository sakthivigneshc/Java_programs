package part6;

public class ConvertNumberToCharacter {
	
	public static void main(String[] args) {
		String input ="a2b3c1";
		for(int i=0;i<input.length();i++) {
			if(Character.isAlphabetic(input.charAt(i))) {
				System.out.print(input.charAt(i));
			}
			else {
				int number = Character.getNumericValue(input.charAt(i));
				for(int j=1;j<number;j++)
				{
					System.out.print(input.charAt(i-1));
				}
			}
		}
	}

}

// i-1 is before the number print the character
/*
input :  a2b3c1
output : aabbbc
*/