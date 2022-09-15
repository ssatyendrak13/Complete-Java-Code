package javatPoint.array;

public class ArrayCopyMethod {
	
	public static void main(String args[]) {
		copy(new int[] {4,5,6,3,2});
	}
	
	public static void copy(int input[]) {
		
		int output[] = new int[input.length];
		
		System.arraycopy(input, 0, output, 0, input.length); 
		for(int i=0;i<input.length;i++) {
			System.out.print(output[i]+" ");
		}
		
	}

}
