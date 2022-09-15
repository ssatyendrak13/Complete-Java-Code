 package codingNinjas.algorithms.searchingSorting.sorting;

public class SelectiionSort {
	
	public static void main(String args []) {
		int arr[] = {4,7,8,2,3,6};
		SelectionSort(arr);
	}

	public static void SelectionSort(int input[] ) {
		
		for(int i=0; i<input.length-1; i++) {
			int  min = input[i];
			int minIndex = i;
			for(int j=i+1; j<input.length; j++) {
				if(input[j] < min) {
					min = input[j];
					minIndex = j;
				}
			}
			if(minIndex!=i) {
				input[minIndex]=input[i];
				input[i]=min;
			}
		}
		for(int item : input) {
			System.out.println(item);
		}
		
	}
	
	
}
