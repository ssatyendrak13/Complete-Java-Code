package ramaSoft.arrays.twoD;

import java.util.Scanner;

public class SumOfDiagonals {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("enter the size of the matrix ");
		int n = sc.nextInt();
		int a[][] = new int [n][n];
		for(int i=0 ; i <a.length; i++) {
			for(int j=0; j <a[i].length; j++)
				a[i][j]=sc.nextInt();
		}
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0 ; i <a.length; i++) {
			for(int j=0; j <a[i].length; j++) {
				if(i==j) {
					sum1 += a[i][j];
				}
				else if(i+j == n-1) {
					sum2 += a[i][j];
				}
			}
		}
		System.out.println("sum of diagonal of  matrix is : "+(sum1+sum2));

	}

}
