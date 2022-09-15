package codingNinjas.algorithms.recursion.recursion1.recursionAndArrays;

public class LastIndexOfNumberInArray {
	
	public static void main(String args[]) {
		System.out.println(lastIndex1(new int[] {4,7,2,5,8,2},0,2));
	}
	//second method to find last index of number in array
	public static int lastIndex1(int input[] , int startIndex , int elem) {
		if(input.length==startIndex) {
			return -1;
		}
		int smallAns = lastIndex1(input , startIndex+1 , elem);
		if(smallAns != -1) {
			return smallAns;
		}
		if(input[startIndex]==elem) {
			return startIndex;
		}else {
			return -1;
		}
	}
	//first method to find last index of number in array
	public static int lastIndex(int input[] , int startIndex , int elem) {
		if(startIndex<0) {
			return -1;
		}
		if(input[startIndex]==elem) {
			return startIndex;
		}
		return lastIndex(input , startIndex-1, elem);
	}
	public static int lastIndex(int input[] , int elem) {
		return lastIndex(input , input.length-1 , elem);
	}

}
