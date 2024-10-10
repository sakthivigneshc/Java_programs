package week1;

import java.util.HashMap;

public class CountCharactersOccurrence {
	
	public static void main(String[] args) {
		
		String a ="occupation";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = a.toCharArray();
		for(int i=0; i<=a.length()-1; i++) {
			
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], 1);
			}
			
		}
		
		System.out.println(map);
		
	}
	
//{p=1, a=1, c=2, t=1, u=1, i=1, n=1, o=2}

}
