package ramaSoft.arrays.twoD;

import java.util.Scanner;

public class CopyElementFrom2DTo1D {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row and col size of two d array ");
		int rsize = sc.nextInt();
		int csize = sc.nextInt();
		int a[][] = new int[rsize][csize];
		int input[]= new int[rsize*csize];
		
		System.out.println("enter the "+rsize*csize+" elements in two d array " );
		for(int i=0; i<rsize; i++) {
			for(int j=0;j<csize; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("two d array is : ");
		for(int i=0; i<rsize; i++) {
			for(int j=0;j<csize; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int k=0;
		for(int i=0; i<rsize; i++) {
			for(int j=0;j<csize; j++) {
				input[k]=a[i][j];
				k++;
			}
		}
		System.out.println("one dimension array is ");
		for(int item : input) {
			System.out.print(item+" ");
		}
		
	}

}
