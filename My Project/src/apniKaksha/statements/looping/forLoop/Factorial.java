package apniKaksha.statements.looping.forLoop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n for factorial");
		int n=sc.nextInt();
		int factorial=1;
		for (int i=n;i>=1;i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);

	}

}
