package apniKaksha.oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
	
		try {
			int a[] = new int [5];
			System.out.println(a[6]);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" occured , plz check your code");
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("index should be in the range of 0 to size of array ");
		}catch(IllegalArgumentException e) {
			System.out.println(" check your casting carefully  ");
		}finally {
			System.out.println("sorry for the inconvinence");
		}
		System.out.println("the very important code ");
		System.out.println("need to run");
	}

}
