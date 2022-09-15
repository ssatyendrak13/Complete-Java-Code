package codingNinjas.arrays.twoDimensional;
import java.util.Scanner;
public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wavePrint1();
		wavePrint();
	}
	
	public static void wavePrint1() {
		int input[][] = takeInput();
		int r =0;
		int c =0;
		for(int i=0; i<input.length*input.length; i++) {
			if(r%2==0) {
				System.out.print(input[c][r]+" ");
				c++;
			}else {
				System.out.print(input[c][r]+" ");
				c--;
			}
			if(c==input.length) {
				r++;
				c--;
			}
			if(c==-1) {
				r++;
				c++;
			}
		}
		System.out.println();
	}
	
	public static void wavePrint() {
		// first approach 
		int input[][] = takeInput();
		int size = input.length;
		for(int i=0; i<size; i++) {
			
			if(i%2==0) {
				for(int j=0; j<size; j++) {
					System.out.print(input[j][i]+" ");
				}
			}else {
				for(int j=size-1 ; j>=0; j--) {
					System.out.print(input[j][i]+" ");
				}
			}
			
		}
		
	}
	public static int[][] takeInput(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the matrix ");
		int n = sc.nextInt();
		int input[][] = new int[n][n];
		System.out.println("enter the "+n*n+" elements in array");
		int r=0;
		int c =0;
		for(int i=0; i<n*n ; i++) {
			input[r][c]=sc.nextInt();
			c++;
			if(c==n) {
				c=0;
				r++;
			}
		}
		return input;
		
	}

}
/*
Sample Input 1:
1
3 4 
1  2  3  4 
5  6  7  8 
9 10 11 12
Sample Output 1:
1 5 9 10 6 2 3 7 11 12 8 4*/
