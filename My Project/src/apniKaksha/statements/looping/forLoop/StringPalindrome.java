package apniKaksha.statements.looping.forLoop;

import java.util.Scanner;

public class StringPalindrome {


	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        String reverse = "";
	        for(int i=A.length()-1; i>=0; i--){
	            reverse = reverse+A.charAt(i);   
	        }
	        if(A==reverse){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) 
	        	    ? "Yes" : "No" );

	}

}
