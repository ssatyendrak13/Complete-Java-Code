package codingNinjas.algorithms.searchingSorting.searching;

public class BinarySearch {
	
	public static void main(String args[]) {
		
		int arr[] = {4,8,9,3,2,6,7};
		int index = BinarySearch(arr , 7);
		System.out.println(index );
		
	}
	
	public static int BinarySearch(int input[] , int elem ) {
		int start = 0;
		int end = input.length-1;
		while(start <= end) {
			int mid = (start + end )/2;
			if(elem == input[mid]) {
				return mid;
			}else if(elem > input[mid]) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
