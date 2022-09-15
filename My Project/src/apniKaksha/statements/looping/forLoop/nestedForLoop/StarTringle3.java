package apniKaksha.statements.looping.forLoop.nestedForLoop;

import java.util.Scanner;

public class StarTringle3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println( );
		}
	}
}
