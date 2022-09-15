package javatPoint.array;

public class JaggedArray {
	
	public static void main(String args[]) {
		print(new int[][] {{7,8},{2,5,8},{6,3,2,5,8}});
	}
	public static void print(int input[][]) {
		
		for(int i=0;i <input.length; i++) {
			for(int j=0; j<input[i].length; j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
