package ramaSoft.arrays.twoD;
import java.util.Scanner;
public class CopyElementFrom2DTo1D1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row and col size ");
		int rsize = sc.nextInt();
		int csize = sc.nextInt();
		int a[][] = new int[rsize][csize];
		int input[] = new int[rsize*csize];
		System.out.println("enter the "+rsize*csize+" elements in two d array " );
		int k=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=sc.nextInt();
				input[k]=a[i][j];
				k++;
			}
		}
		System.out.println("the one dimensional array is ");
		for(int item : input) {
			System.out.print(item+" ");
		}
	}

}
