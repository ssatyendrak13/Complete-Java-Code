package apniKaksha.Array;
import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how many friends you have ");
		int n =  sc.nextInt();
		String name[] = new String[n];
		for(int i =0; i<n;i++) {
//			System.out.println("enter the name of your friends "+(i+1));
			name[i]  = sc.nextLine();
		}
		for(int i =0; i<n; i++) {
			System.out.println(name[i]);
		}
		
		
	}

}
