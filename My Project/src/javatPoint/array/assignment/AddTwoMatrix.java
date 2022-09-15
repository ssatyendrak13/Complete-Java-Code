package javatPoint.array.assignment;
import java.util.Scanner;
public class AddTwoMatrix {

	public static void main(String[] args) {
		add();  

	}
	public static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the matrix");
		int n = sc.nextInt();
		
		int a[][]=new int[n][n];
		int b[][] = new int[n][n];
		System.out.println("enter element in first matrix ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("enter element in second matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				b[i][j]=sc.nextInt();
		}
		int c[][] = new int[n][n];
		System.out.println("sum of two matrix is ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
		
	}

}
