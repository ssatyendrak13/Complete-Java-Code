package codingNinjas.algorithms.recursion.recursion1.recursionAndArrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		System.out.println(sum(new int [] {1,2,3,4,5} , 0));

	}
	public static int sum(int input[] , int startIndex) {
		if(input.length == startIndex) {
			return 0;
		}
		return input[startIndex]+sum(input , startIndex+1);
	}

}
