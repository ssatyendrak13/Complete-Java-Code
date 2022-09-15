package javatPoint.exceptionHandling.finallyBlock;

public class Example {
	
	public static void main(String args[]) {
		
		int result = check1();
		System.out.println(result);
		
	}
	
	public static int check1() {
		
		try {
			int a=10;
			int b=5;
			int c = a/b;
			return c;
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("this code is  from finally block");
		}
		System.out.println("rest of the code");
		return 0;
	}
	
	public static void check() {
		try {
			int a=50;
			int b=0;
			int c = a/b;
			System.out.println(c);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("this code is from finally block");
		}
		System.out.println("rest of the code");
	}
	
	

}
