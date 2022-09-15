package codingNinjas.algorithms.recursion.recursion1.recursionAndArrays;

public class CheckSortedBetter {

	public static void main(String[] args) {
		
		System.out.println(checkSorted(new int[] {1,2,3,5,6},0));
		

	}
	public static boolean checkSorted(int input[] , int startIndex) {
		if(input.length-1==startIndex) {
			return true;
		}
		if(input[startIndex]>input[startIndex+1]) {
			return false;
		}
		return checkSorted(input , startIndex+1);
		
	}

}
