package apniKaksha.statements.looping.doWhileLoop;

import java.util.Scanner;

public class SumOfReciprocalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the any number for sum");
		int n=sc.nextInt();
		double sum=0;
		float i=1;
		do {
			if(i%2==0) {
			sum-=1/i;
			i++;
			}else {
				sum+=1/i;
				i++;
			}
		}while(i<=n);
		System.out.println(sum);
	}

}
