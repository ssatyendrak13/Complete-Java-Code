package javatPoint.array;

public class MatrixPrint {
	
	public static void main(String args[]) {
		print(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
	}
	
	public static void print(int input[][]) {
		
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length; j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	

}
