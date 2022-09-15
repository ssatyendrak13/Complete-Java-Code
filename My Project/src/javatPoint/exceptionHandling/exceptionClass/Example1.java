package javatPoint.exceptionHandling.exceptionClass;
import java.util.*;
public class Example1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a= sc.nextInt();
		if(a<10) {
			try {
				throw new MyException();
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
		
	}

}
class MyException extends Exception{
	
	public String toString() {
		return " i am toString()";
	}
	public String getMessage() {
		return " i am getMessage()";
	}
	
}
