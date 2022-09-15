package codingNinjas.arrays.twoDimensional;

import java.util.Scanner;

public class LargestRowORCol {
	
	public static void main(String args[]) {
		LargestSum();
	}
	
	public static void LargestSum() {
		int input[][] = takeInput();
		int sumRow = 0;
		int indexRow = 0;
		for(int i=0; i<input.length; i++) {
			int temp = 0;
			for(int j=0; j<input[i].length; j++) {
				temp +=input[i][j];
			}
			if(sumRow < temp ) {
				sumRow  = temp;
				indexRow = i;
			}
		}
		int sumCol =0;
		int indexCol=0;
		for(int i=0; i<input.length; i++) {
			int temp = 0;
			for(int j=0; j<input[i].length; j++) {
				temp +=input[j][i];
			}
			if(sumCol < temp ) {
				sumCol  = temp;
				indexCol = i;
			}
		}
		if(sumRow>sumCol) {
			System.out.println("row "+indexRow+" and sum : "+sumRow);
		}else {
			System.out.println("col "+indexCol+" and sum : "+sumCol);
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
