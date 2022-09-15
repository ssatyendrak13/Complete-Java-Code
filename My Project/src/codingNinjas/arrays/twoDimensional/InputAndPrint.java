package codingNinjas.arrays.twoDimensional;
import java.util.Scanner;
public class InputAndPrint {
	
	public static void main(String args[]) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the rows number");
		int row = sc.nextInt();
		System.out.println("enter the columns number ");
		int col = sc.nextInt();
		int input[][]  = new int[row][col];
		System.out.println("enter the "+row*col+" elements in arrays");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				input[i][j]=sc.nextInt();
			}
		}
		for(int one[] : input) {
			for(int item : one) {
				System.out.print(item+" ");
			}
			System.out.println();
		}
	}

}
