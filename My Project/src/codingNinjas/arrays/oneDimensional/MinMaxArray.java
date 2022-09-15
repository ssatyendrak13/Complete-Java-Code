package codingNinjas.arrays.oneDimensional;

public class MinMaxArray {
	
	public static void main(String args[]) {
		
		System.out.println(max(new int[] {4,7,8,9,6,2}));
	}
	
	public static int min(int input[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<input.length; i++) {
			if(min>input[i]) {
				min=input[i];
			}
		}
		return min;
	}
	public static int max(int input[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<input.length; i++) {
			if(max<input[i]) {
				max=input[i];
			}
		}
		return max;
	}

}
