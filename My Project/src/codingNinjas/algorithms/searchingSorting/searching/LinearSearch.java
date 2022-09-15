package codingNinjas.algorithms.searchingSorting.searching;

public class LinearSearch {
	
	public static void main(String args[]) {
		
		int arr[] = {7,4,5,6};
		search(arr , 10);
	}
	
	public static  void search(int input[] , int val) {
		for(int i=0; i<input.length; i++) {
			if(input[i]==val) {
				System.out.println(i);
			}
		}
		System.out.println("this value does not exist in this array ");
	}

}
