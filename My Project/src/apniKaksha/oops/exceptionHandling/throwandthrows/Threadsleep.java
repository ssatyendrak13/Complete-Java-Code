package apniKaksha.oops.exceptionHandling.throwandthrows;

public class Threadsleep {

	public static void main(String args [] ){
		
		int c=5+6;
		System.out.println(c);
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("the print this line after the delay ");

	}
}
