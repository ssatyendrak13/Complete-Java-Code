package apniKaksha.statements.looping.forLoop;
import java.util.Scanner;

public class SumOfNumber {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int i;
		int sum=0;
		for(i=1;i<=n;i++) {
//			System.out.println(i);
			sum=sum+i;
//			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
