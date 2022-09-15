package ramaSoft.exceptionHandling;
import java.util.*;
public class Example {
	
	public static void main(String args[]) {
		
		 	try
	        {
		        Scanner sobjr=new Scanner(System.in);
		        System.out.println("Enter two values:");
		        int num1=sobjr.nextInt();
		        int num2=sobjr.nextInt();
		        System.out.println("Division="+(num1/num2));
		                          //Exception Search---->ArithmeticException
		                           //Object----throw
		        System.out.println("Multiplication="+(num1*num2));
		        System.out.println("Subtraction="+(num1-num2));
		        System.out.println("Addition="+(num1+num2));
	        
	        }
	        catch(ArithmeticException e) //respective catch
	        {
	            System.out.println("Cant Divide by zero");    
	        }
	         System.out.println("reach to end of line");
	}

}
