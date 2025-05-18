package part6;

import java.util.Scanner;

public class CharacterOccurrenceWithoutHashMap {
	public static void main(String[] args) {
		// iteration
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		char[] inputCharacters = scanner.next().toCharArray();
		System.out.println("Enter the character to count :");
		char inputcount = scanner.next().charAt(0);
		int count =0; 
		for(int i=0; i<inputCharacters.length;i++) {
			//apple
			if(inputcount == inputCharacters[i]) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
		
		
		
	}

}
