package codingNinjas.algorithms.recursion.recursion1.recursionAndArrays;

public class AllIndexOfNumberInArray {
	
	public static void main(String args[]) {
		allIndex(new int[] {4,5,6,3,6},0,6);
	}
	
	public static void allIndex(int input[] , int startIndex , int elem) {
		if(input.length == startIndex) {
			return;
		}
		if(input[startIndex]==elem) {
			System.out.print(startIndex+" ");
		}
		allIndex(input , startIndex+1 , elem);
		
	}

}
