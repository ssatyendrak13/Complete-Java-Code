package ramaSoft.arrays.twoD;
import java.util.*;
public class CopyElementFrom1DTo2D {
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of one d array ");
		int n =   sc.nextInt();
		int input[] =  new int[n*n];
		int a[][] = new int[n][n];
		System.out.println("enter the elements in array ");
		for(int i=0; i<input.length; i++) {
			input[i]=sc.nextInt();
		}
		int r=0; int c =0;
		for(int i=0; i<n*n; i++) {
			a[r][c++]=input[i];
			if(c==n) {
				r++;
				c=0;
			}
		}
		int j=0; int k=0;
		for(int i=0; i<n*n; i++) {
			System.out.print(a[j][k]+" ");
			k++;
			if(k==n) {
				j++;
				k=0;
				System.out.println();
			}
		}
	}

}
