package ramaSoft.arrays.twoD;

import java.util.Scanner;

public class SumOfDiagonals1 {

	public static void main(String[] args) {

		Scanner sc = new  Scanner(System.in);
		
		System.out.println("enter the size of the matrix ");
		int n = sc.nextInt();
		int a[][] = new int [n][n];
		int r=0; int c =0;
		int sum =0;
		for(int i=0; i<n*n; i++) {
			a[r][c]=sc.nextInt();
			if((r+c)%2==0) sum += a[r][c];
			c++;
			if(c==n) {
				r++;
				c=0;
			}
		}
		System.out.println(sum);
	}

}
