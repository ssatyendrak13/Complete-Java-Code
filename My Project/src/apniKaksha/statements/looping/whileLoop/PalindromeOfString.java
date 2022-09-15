package apniKaksha.statements.looping.whileLoop;
import java.util.Scanner;
public class PalindromeOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the any string ");
		String str = sc.next();
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}

}
