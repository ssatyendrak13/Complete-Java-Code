package apniKaksha.statements.looping.whileLoop;

import java.util.Scanner;

public class SumOfAlternateReciprocalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for sum");
		int n=sc.nextInt();
		double sum=0;
		float i=1;
		while(i<=n) {
			if(i%2==0) {
				sum-=1/i;
				i++;
			}else {
				sum+=1/i;
				i++;
			}
		}
		System.out.println("sum of alternate reciprocal number  is= "+sum);

	}

}
