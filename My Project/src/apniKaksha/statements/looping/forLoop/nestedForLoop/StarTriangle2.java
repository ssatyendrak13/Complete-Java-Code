  package apniKaksha.statements.looping.forLoop.nestedForLoop;

import java.util.Scanner;

public class StarTriangle2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
//		for(int j=1;j<=n;j++) {
//			for(int i=1;i<=j;i++) {
//				System.out.print(" *");
//			}
//			System.out.println( );
//		}
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i-1;j++) {
				 System.out.print("  ");
			 }for(int j=1;j<=n-i+1;j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }

	}

}
