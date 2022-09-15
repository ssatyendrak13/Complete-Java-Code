package apniKaksha.statements.looping.forLoop;

import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
//		int n=sc.nextInt();
		for(;;) {
			int n=sc.nextInt();
			System.out.println("please enter negative value");
			if (n<0) {
				System.out.println("thank u for entering negative value");
				break;
			}
//			else {
//				System.out.println("please enter negative value");
//				break;
//			}
		}

	}

}
