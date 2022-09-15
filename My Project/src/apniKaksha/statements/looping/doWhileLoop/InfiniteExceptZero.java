package apniKaksha.statements.looping.doWhileLoop;

import java.util.Scanner;

public class InfiniteExceptZero {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
//		int n=sc.nextInt();
		int n=1;
		do {
			n=sc.nextInt();
			System.out.println("number "+n);
		}while(n!=0);
	}

}
