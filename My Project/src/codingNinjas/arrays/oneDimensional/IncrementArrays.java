package codingNinjas.arrays.oneDimensional;

public class IncrementArrays {
	
	public static void main(String args []) {
		
		int arr[] = {1,2,3,4,5};
		increment(arr);
		print(arr);
	}
	
	public static void increment(int input[]) {
		for(int i=0; i<input.length;i++) {
			input[i]++;
		}
	}
	public static void print(int input[]) {
		for(int i=0; i<input.length; i++) {
			System.out.println(input[i]);
		}
		
	}

}
