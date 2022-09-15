package javatPoint.exceptionHandling.throwsKeyword;

public class Example {

	public static void main(String[] args) {
		
		try {
			int c = divide(5,0);
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	public static int divide(int a , int b) throws Exception{
		int result = a/b;
		return result;
	}

}
