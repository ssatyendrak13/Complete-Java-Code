package apniKaksha.statements.looping.forLoop;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter any value for prime");
		int n=sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i < n; i++) {
			if(n%i==0) {
				isPrime=false;
			}
		}
		if(n<2) {
			isPrime=false;
		}
		System.out.println("isPrime "+isPrime);
		

	}

}
