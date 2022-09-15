package apniKaksha.statements.looping.forLoop.nestedForLoop;

import java.util.Scanner;

public class Nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}

	}

}
