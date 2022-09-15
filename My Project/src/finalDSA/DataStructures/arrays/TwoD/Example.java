package finalDSA.DataStructures.arrays.TwoD;
import java.util.*;
public class Example {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		System.out.println("enter the "+n*n+"elements in the two d array");
		for(int i=0; i<n; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
