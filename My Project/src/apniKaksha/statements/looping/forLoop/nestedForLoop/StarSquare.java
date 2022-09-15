package apniKaksha.statements.looping.forLoop.nestedForLoop;
import java.util.Scanner;

public class StarSquare {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int j=1;j<=n;j++) {
//			System.out.println("enter the value of m");
//			int m=sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
