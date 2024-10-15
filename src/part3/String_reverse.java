package part3;

public class String_reverse {

	public static void main(String[] args) {

		String a = "programming";
		String b ="";
		int length = a.length();
		for(int i=length-1;i>=0; i--) {
			b +=  a.charAt(i);
			}
		System.out.println(b);
		
	}

}
