package apniKaksha.statements.conditionalStatemet;
import java.util.Scanner;
public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		if (a>18) {
			System.out.println("you can vote now");
		}else {
			System.out.println("you are not able to votting");
		}
		

	}

}
