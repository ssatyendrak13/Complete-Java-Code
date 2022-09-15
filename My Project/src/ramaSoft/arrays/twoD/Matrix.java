package ramaSoft.arrays.twoD;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("enter the size of the matrix ");
		int n = sc.nextInt();
		int a[][] = new int [n][n];
		for(int i=0 ; i <a.length; i++) {
			for(int j=0; j <a[i].length; j++)
				a[i][j]=sc.nextInt();
		}
		for(int i=0 ; i <a.length; i++) {
			for(int j=0; j <a[i].length; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("first diagonal of a matrix is : ");
		
		for(int i=0 ; i <a.length; i++) {
			for(int j=0; j <a[i].length; j++) {
				if(i==j) {
					System.out.print(a[i][j]+" ");
				}else {
					System.out.print("--");
				}
			}
			System.out.println();
		}
		System.out.println("second diagonal of matrix is : ");

		for(int i=0 ; i <a.length; i++) {
			for(int j=0; j <a[i].length; j++) {
				if(i+j==n-1) {
					System.out.print(a[i][j]+" ");
				}else {
					System.out.print("--");
				}
			}
			System.out.println();
		}
	}

}
