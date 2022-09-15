package javatPoint.exceptionHandling.exceptionClass;

import java.util.Scanner;

public class CustomClass {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		if(a<10) {
			try {
				throw new Custom();
			}catch(Exception e) {
				System.out.println(((Custom)e).eat());
				System.out.println(((Custom)e).walk());
			}
		}
		
	}

}
class Custom extends Exception{
	public String eat() {
		return "eating";
	}
	public String walk() {
		return "walking";
	}
}
