package codingNinjas.arrays.twoDimensional;
import java.util.Scanner;
public class TakeinputInOrderOfN {
	
	public static void main(String args[]) {
		print();
	}
	
	public static void print() {
		int input[][] = takeInput();
		int r=0;
		int c=0;
		for(int i=0;i<input.length*input.length; i++) {
			System.out.print(input[r][c]+" ");
			c++;
			if(c==input.length) {
				r++;
				c=0;
				System.out.println();
			}
		}
		
	}
	
	public static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the arrays ");
		int n = sc.nextInt();
		System.out.println("enter the "+n*n+" elements in arrays ");
		int r =0;
		int c =0;
		int input[][] = new int[n][n];
		for(int i=0; i<n*n; i++) {
			input[r][c]=sc.nextInt();
			c++;
			if(n==c) {
				c=0;
				r++;
			}
		}
		return input;
	}

}
