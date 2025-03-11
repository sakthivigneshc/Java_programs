package part6;
public class Number_Of_1_Bits {
    public static int hammingWeight(int n) {

        int count =0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
    
    
    public static void main(String[] args) {
		int answer = hammingWeight(128);
		System.out.println(answer);
		
	}
}





// 191. Number of 1 Bits