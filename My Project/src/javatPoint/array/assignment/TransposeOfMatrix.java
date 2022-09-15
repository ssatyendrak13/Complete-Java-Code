package javatPoint.array.assignment;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		
		int input[][] = {{1,3,4},{2,4,3},{3,4,5}};
		System.out.println("before transpose");
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length;j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
		int output[][] = new int[3][3];
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length;j++) {
				output[i][j]=input[j][i];
			}
		}
		System.out.println();
		System.out.println("After transpose");
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length;j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}

	}

}
