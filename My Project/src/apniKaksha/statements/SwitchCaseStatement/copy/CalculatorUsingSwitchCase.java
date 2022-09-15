package apniKaksha.statements.SwitchCaseStatement.copy;
import java.util.Scanner;

public class CalculatorUsingSwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
//		String a=sc.nextLine();
		int a=sc.nextInt();
		System.out.println("enter the value of b");
//		String b=sc.nextLine();
		int b=sc.nextInt();
		System.out.println("enter the operation");
		sc.nextLine();
		char operation=sc.nextLine().charAt(0);
		int result=0;
		switch(operation) {
		case '+':
//			System.out.println("addition of a and b is= "+result);
			result=a+b;
			break;
		case'-':
			result=a-b;
			break;
		case'*':
			result=a*b;
			break;
		case'/':
			result=a/b;
			break;
			default:
				System.out.println("invalid operation");
		}
		System.out.println("result is= "+result);

		
		

	}

}
