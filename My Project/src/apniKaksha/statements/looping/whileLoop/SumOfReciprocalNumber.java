package apniKaksha.statements.looping.whileLoop;

import java.util.Scanner;

public class SumOfReciprocalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int  n=sc.nextInt();
		double sum=0;
		float i=1;
		while(i<=n) {
			sum=sum+1/i;
			i++;
		}
		System.out.println("sum of reciprocal number is= "+sum);

	}

}
