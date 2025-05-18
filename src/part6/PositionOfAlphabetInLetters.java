package part6;

import java.util.Scanner;

public class PositionOfAlphabetInLetters {
	public static void main(String[] args) {

			Scanner scanner =  new Scanner(System.in);
			System.out.println("Enter a letter : ");
			Character inputLetter =  scanner.next().charAt(0);
			int outputPosition =  (int)inputLetter - 96 ;
			System.out.println("Position of"+" " +inputLetter +" "+ "is : " +outputPosition);
			scanner.close();
	}
}
