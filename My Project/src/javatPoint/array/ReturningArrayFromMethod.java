package javatPoint.array;

public class ReturningArrayFromMethod {
	
	public static void main(String args[]) {
		
		int arr[] = returnArray();
		for(int item : arr) {
			System.out.print(item+" ");
		}
		
	}
	
	public static int[] returnArray() {
		
		return new int[] {8,6,9,5,2};
		
	}

}
