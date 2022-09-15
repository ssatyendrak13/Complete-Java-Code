package codingNinjas.algorithms.searchingSorting.sorting;

public class InsertiionSort {
	
	public static void main(String args[]) {
		
		int input[] = {4,8,5,6,2,3};
		InsertionSort(input);
		for(int i=0; i<input.length; i++) {
			System.out.println(input[i]);
		}
		
	}
	
	public static void InsertionSort(int input[]) {
		
		for(int i=1; i<input.length; i++) {
			
			int j=i-1; 
			int temp = input[i];
			while( j>= 0 && input[j]>temp) {
				input[j+1]=input[j];
				j--;
			}
			input[j+1]=temp;
			
			 
		}
	}

}
