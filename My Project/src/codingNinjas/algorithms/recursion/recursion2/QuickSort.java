package codingNinjas.algorithms.recursion.recursion2;

public class QuickSort {

	public static void main(String[] args) {
		
		int input[] = {1,5,7,1};
		int si = 0;
		int ei = input.length-1;
		quickSort(input , si , ei);
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();

	}
	public static int partition(int input[] , int si  , int ei) {
		
		int pivot = input[si];
		int countSmaller=0;
		for(int i=si+1; i<=ei; i++) {
			if(input[i]<=pivot) {
				countSmaller++;
			}
		}
		int pivotIndex = countSmaller+si;
		input[si]=input[pivotIndex];
		input[pivotIndex]=pivot;
		int i=si;
		int j=ei;
		while(i<pivotIndex && j>pivotIndex) {
			if(input[i]< pivot ) {
				i++;
			}else if(input[j]>pivot) {
				j--;
			}else {
				int temp = input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;
				j--;
			}
		}
		return pivotIndex;
		
	}
	
	public static void quickSort(int input[] , int si  , int ei) {
		
		if(si>=ei) {
			return ;
		}
		int p = partition(input , si , ei);
		quickSort(input , si , p-1);
		quickSort(input , p+1 , ei);
		
	}

}
