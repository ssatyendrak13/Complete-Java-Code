package javatPoint.string;

public class StringVsStringBuffer {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		ConcatWithString();
		System.out.println(System.currentTimeMillis() - startTime);
		
		startTime = System.currentTimeMillis();
		ConcatWithStringBuffer();
		System.out.println(System.currentTimeMillis()-startTime);

	}
	public static String ConcatWithString() {
		
		String s = "java";
		for(int i=0;i<10000; i++) {
			s = s+ "tpoint";
		}
		return s;
	}
	public static String ConcatWithStringBuffer() {
		
		StringBuffer sb = new StringBuffer("java");
		for(int i=0;i<10000;i++) {
			sb =sb.append("tpoint");
		}
		return sb.toString();
		
	}

}
