package part4;

public class PrintNumbersWithOutLoop {
	
	public static void number(int n) {
		if(n<=100) {
			System.out.print(n+" ");
			n++;
			number(n);
		}
	}
	
	

	public static void main(String[] args) {
		number(1);
	}

}



//NAL
