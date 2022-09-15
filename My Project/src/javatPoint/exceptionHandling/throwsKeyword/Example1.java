package javatPoint.exceptionHandling.throwsKeyword;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws MyException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		try {
			if(a<0) {
				throw new MyException();
			}
		}catch(MyException e) {
			System.out.println(e);
		}

	}

}
class MyException extends Exception{
	
	public String toString() {
		return "exception  is that you are entered the value negative";
	}
	
}
