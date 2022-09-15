package codingNinjas.arrays.twoDimensional;

import java.util.Scanner;

public class FunctionWithTwoD {
	
	public static void main(String args[]) {
		int input[][]= takeInput();
		print(input);
	}
	
	public static void print(int input[][]) {
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input[i].length; j++) {
				System.out.print(input[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	public static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of rows ");
		int row = sc.nextInt();
		System.out.println("enter the size of columns ");
		int col = sc.nextInt();
		int input[][] = new int[row][col];
		System.out.println("enter the "+row*col+" elements in arrays ");
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input[i].length; j++) {
				input[i][j]=sc.nextInt();
			}
		}
		return input;
	}

}
