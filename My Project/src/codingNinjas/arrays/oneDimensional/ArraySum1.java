package codingNinjas.arrays.oneDimensional;

public class ArraySum1 {

	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4,5};
		sum(arr);
		
	}
	
	public static void sum(int input[]) {
		int result = 0;
		for(int i = 0; i<input.length; i++) {
			result=result+input[i];
		}
		System.out.println(result);
	}
	
}
