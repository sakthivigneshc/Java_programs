package week2;

public class Count_Capital_Small_letters {
	public static void main(String[] args) {
		String words = "SRILaNkA";
		int capitalLetterCount = 0;
		int smallLetterCount = 0;
		char [] ch = words.toCharArray();

		for(int i=0; i<ch.length;i++) {
			
			if(Character.isUpperCase(ch[i])) {
				 capitalLetterCount++;
			}
			else  {
				 smallLetterCount++;
			}
		}
		
		System.out.println("Total Capital letters :"+ capitalLetterCount);
		System.out.println("Total Small letters : "+ smallLetterCount);
		
	} 

}
