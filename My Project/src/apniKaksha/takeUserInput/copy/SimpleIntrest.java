package apniKaksha.takeUserInput.copy;
import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle value");
		int p=sc.nextInt();
		System.out.println("enter the value of rate");
		float r=sc.nextFloat();
		System.out.println("enter the value of time");
		int t=sc.nextInt();
//		int s;
		double s=(p*r*t)/100;
		System.out.println("simple intrest is= "+s);
		

	}

}
