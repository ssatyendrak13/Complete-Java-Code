package javatPoint.string.String;

public class StringClassMethod {

	public static void main(String[] args) {
		
		String s = new String("sattu");
		String s2 = s.intern();
		System.out.println(s2);
		int a = 10;
		String value = String.valueOf(a);
		System.out.println(value);

	}

}
