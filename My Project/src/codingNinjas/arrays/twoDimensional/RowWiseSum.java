package codingNinjas.arrays.twoDimensional;

import java.util.Scanner;

public class RowWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]input = takeInput();
		sum(input);
	}
	
	public static void sum(int input[][]) {
		for(int i=0; i<input.length; i++) {
			int sum = 0;
			for(int j=0; j<input[i].length; j++) {
				sum += input[i][j];
			}
			System.out.println(sum);
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
