package codingNinjas.algorithms.searchingSorting.sorting;

public class BubbleSort {
	
	public static void main(String args[]) {
		
		int arr[] = {4,8,3,6,9};
		bubblesort(arr);
		bubbleSortInOrderOfN(arr);
	}
	public static void bubbleSortInOrderOfN(int input[]) {
		
		int size = input.length;
		int r =0;
		for(int i=0; i<size*size; i++) {
			if(input[r]>input[r+1]) {
				int temp = input[r];
				input[r]=input[r+1];
				input[r+1]=temp;
			}
			r++;
			if(r==size-1) {
				r=0;
			}
			
		}
		for(int item : input) {
			System.out.print(item+" ");
		}
		System.out.println();
		
	}
	// first method for bubble sort 
	public static void bubblesort(int input[]) {
		for(int j=0; j<input.length; j++) {
			for(int i=0; i<input.length-1;i++) {
				if(input[i+1]<input[i]) {
					int temp=input[i+1];
					input[i+1]=input[i];
					input[i]=temp;
				}
			}
		}
		for(int item : input) {
			System.out.print(item+" ");
		}
		System.out.println();
	}

}
