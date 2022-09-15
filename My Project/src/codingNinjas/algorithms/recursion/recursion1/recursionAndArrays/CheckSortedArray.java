package codingNinjas.algorithms.recursion.recursion1.recursionAndArrays;

public class CheckSortedArray {

	public static void main(String[] args) {
		
		System.out.println(checkSorted(new int[] {4,7,8,2,3}));

	}
	public static boolean checkSorted(int input[]) {
		
		if(input.length <= 1) {
			return true;
		}
		int smallInput[] = new int[input.length-1];
		for(int i=1; i<input.length; i++) {
			smallInput[i-1]=input[i];
		}
		boolean smallAns = checkSorted(smallInput);
		if(!smallAns) {
			return false;
		}
		if(input[0]<=input[1]) {
			return true;
		}else {
			return false;
		}
		
	}

}
