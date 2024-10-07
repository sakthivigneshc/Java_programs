package week1;

public class ReverseWords {
	public static void main(String[] args) {
		
		String str = "the sky is blue";
		StringBuilder reverse =  new StringBuilder();
		String [] words =  str.split(" ");
		
		for(int i=words.length-1; i>=0; i--) {
			reverse.append(words[i]).append(" ");
		}
		
		System.out.println(reverse);		
	}
}

