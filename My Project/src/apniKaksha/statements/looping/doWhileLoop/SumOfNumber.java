package apniKaksha.statements.looping.doWhileLoop;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the any number");
		int n=sc.nextInt();
		double sum=0;
		float i=1;
		do {
			sum+=1/i;
			i++;
		}while(i<=n);
		System.out.println(sum);
	}
}
