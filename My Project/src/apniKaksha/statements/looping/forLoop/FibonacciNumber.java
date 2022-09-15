package apniKaksha.statements.looping.forLoop;
import java.util.Scanner;
public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number fot fibonacci number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
//		b=a;
		System.out.print (a+" "+b);
		for(int i=0;i<=n;i++) {
			b=b+a;
		}
		System.out.println(a);
		System.out.println(b);
	}

}
