package ramaSoft.exceptionHandling;

import java.util.Scanner;

public class Example2 {

	 public static void main(String[] args) {
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
	       catch(Exception e) //receives any type of excdption calss object
	       {                //but it must be last when multiple catch
	           e.printStackTrace();
	       }
	         System.out.println("reach to end of line");
	       
	        }
}
