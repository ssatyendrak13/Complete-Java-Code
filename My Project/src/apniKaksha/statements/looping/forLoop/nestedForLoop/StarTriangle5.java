package apniKaksha.statements.looping.forLoop.nestedForLoop;

import java.util.Scanner;

public class StarTriangle5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {//general formula 2(n-i)
				System.out.print("  ");//2 is not use so two spaces are taken
			}for(int j=1;j<=i;j++) {
				System.out.print("*    ");//in every row star with three spaces are required
			}
			System.out.println( );//this line is new line character
		}

	}

}
