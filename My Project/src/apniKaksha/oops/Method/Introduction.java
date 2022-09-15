package apniKaksha.oops.Method;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNumber=42;
		int secondNumber=30;
		int result=maxOf(firstNumber,secondNumber);
		System.out.println(result);
		

	}
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
