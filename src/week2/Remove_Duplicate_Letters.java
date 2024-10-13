package week2;

import java.util.LinkedHashSet;

public class Remove_Duplicate_Letters {
//	Remove Duplicate Letters
	public static String removeDuplicateLetters(String s) {
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		StringBuilder builder  = new StringBuilder();

		for(int i=0; i<ch.length; i++)
		{
			
			if(set.add(ch[i])) {
	    		   builder.append(ch[i]);
	    	   }

			
		}
		return builder.toString();     
    }
	
	public static void main(String[] args) {
		String s  ="cbacdcbc";
		System.out.println(removeDuplicateLetters(s) );
	}
	
}


//FAQ
