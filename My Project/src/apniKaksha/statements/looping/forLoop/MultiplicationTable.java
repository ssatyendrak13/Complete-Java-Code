package apniKaksha.statements.looping.forLoop;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n for multiplication");
		int n=sc.nextInt();
//		for (int i=10;i>=1;i--) {
		for (int i=1;i<=10;i++) {

			System.out.println(n*i);
		}

	}

}
