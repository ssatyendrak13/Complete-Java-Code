package apniKaksha.Array;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dimension ");
//		int a[][]= {
//				{5,6,3,8},{7,1,6,3},{8,9,6},{2,8,6,4,3}
//		};
//		System.out.println(a[2][1]);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][]=new int [row][col];
		int b[][]=new int [row][col];
		System.out.println("enter the array a");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the array b");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int [row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("result array c is :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println( );
		}
//		System.out.println( );
	}

}
