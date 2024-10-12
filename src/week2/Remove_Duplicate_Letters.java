package week2;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Letters {
//	Remove Duplicate Letters
	
	
	public static String removeDuplicateLetters(String s) {

        Set<Character> set = new HashSet<>();

//        char []  ch = s.toCharArray();
        for(int i=0; i<=s.length()-1;i++) {
            set.add(s.charAt(i));
            }
//        set.
		return set.toString();
        
    }
	
	public static void main(String[] args) {
		String s  ="bcabc";
  System.out.println(removeDuplicateLetters(s) );
	}
	
	
	
}

