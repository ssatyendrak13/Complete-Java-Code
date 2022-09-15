package apniKaksha.statements.looping.forLoop.nestedForLoop;

import java.util.Scanner;

public class DigitTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int number=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}for(int j=1;j<=i;j++) {
				System.out.print(number+"   ");
				number++;
			}
			System.out.println( );
		}

	}

}
