package codingNinjas.algorithms.recursion.recursion1.recursionAndArrays;

public class FirstIndexOfNumberInArray {
	
	public static void main(String args[]) {
		
		System.out.println(firstIndex(new int[] {7,8,6,5,4},0,4));
	}
	
	public static int firstIndex(int input[] , int startIndex , int elem) {
		if(input.length == startIndex) {
			return -1;
		}
		if(input[startIndex]==elem) {
			return startIndex;
		}
		return firstIndex(input ,startIndex+1 , elem);
	}

}
