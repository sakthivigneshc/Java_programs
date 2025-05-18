package part6;

public class LeadingAndTrailingZeros {
	public static void main(String[] args) {
		String name = "   firefox    a ";
		String outputName = name.replaceAll("[ \t]+$", "");
		System.out.println(outputName);
	}

}
