package hackerrank.java;
import java.util.Scanner;
public class JavaStringIntroduction {

	public static void main(String[] args) {
		        
		        Scanner sc=new Scanner(System.in);
		        String A=sc.next();
		        String B=sc.next();
		        /* Enter your code here. Print output to STDOUT. */
		        System.out.println(A.length()+B.length());
		        // System.out.println("No");
		        System.out.println(A.compareTo(B)>0?"Yes":"No");
		        String A1=A.substring(0,1);
		        String A2=A1.toUpperCase();
		        String A3=A.substring(1);
		        String A4 = A2.concat(A3);
		        
		        String B1=B.substring(0,1);
		        String B2=B1.toUpperCase();
		        String B3=B.substring(1);
		        String B4 = B2.concat(B3);
		        
		        System.out.println(A4+" "+B4);
		 
	}

}
