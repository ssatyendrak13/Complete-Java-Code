package codingNinjas.arrays.twoDimensional;

import java.util.Scanner;

public class MaxColSum {

	public static void main(String[] args) {
		
		maxColSum();
	}
	
	public static void maxColSum() {
		int input[][] = takeInput();
		int sum =0;
		for(int i=0; i<input.length; i++) {
			int temp =0;
			for(int j=0; j<input[i].length; j++) {
				temp += input[j][i];
			}
			if(sum < temp ) {
				sum=temp;
			}
		}
		System.out.println(sum);
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
