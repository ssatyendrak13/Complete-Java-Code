package codingNinjas.algorithms.recursion.recursion1.recursionAndArrays;

public class CheckNumberInArray {

	public static void main(String[] args) {

		System.out.println(checkNum(new int[] {1,5,6,4,8},0,8));

	}
	public static boolean checkNum(int input[] , int startIndex , int elem) {
		if(input.length==startIndex) {
			return false;
		}
		if(input[startIndex]==elem) {
			return true;
		}
		return checkNum(input , startIndex+1 , elem);
	}

}
