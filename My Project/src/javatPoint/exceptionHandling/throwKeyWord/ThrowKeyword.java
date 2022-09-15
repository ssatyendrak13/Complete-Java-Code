package javatPoint.exceptionHandling.throwKeyWord;

public class ThrowKeyword {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("person is not aligible to vote");
		}else {
			System.out.println("person is eligible to vote");
		}
	}
	
	public static void main(String args[]) {
		
		validate(15);
		System.out.println("rest of the code");
	}

}
