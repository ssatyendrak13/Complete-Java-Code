package apniKaksha.statements.conditionalStatemet;
import java.util.Scanner;

public class ElIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age of driver");
		int age=sc.nextInt();
		if (age>18) {
			System.out.println("driver can drive the car");
		}else if (age==18){
			System.out.println(" first come and after that thilk about  it");
		}else {
			System.out.println("driver can not drive the car");
		}
		

	}

}
