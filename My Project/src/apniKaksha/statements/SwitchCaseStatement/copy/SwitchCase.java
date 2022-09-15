package apniKaksha.statements.SwitchCaseStatement.copy;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the any number for switch case ");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("enter the radius of circle");
			short r=sc.nextShort();
			System.out.println("area of circle is="+3.14*r*r);
			break;
		case 2:
			System.out.println("enter lenth of rectangle");
			int l=sc.nextInt();
			System.out.println("enter the wirth of rectangle");
			int b=sc.nextInt();
			System.out.println("area of rectangle = "+(l*b));
			break;
			default:
				System.out.println("out of range ");
		}

	}

}
