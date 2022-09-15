package codingNinjas.algorithms.recursion.recursion2;

public class MergeSort {
	
	public static void main(String args[]) {
		
		int input[] = {4,2,1,3,5,6};
		mergeSort(input , 0, input.length-1);
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
		
	}
	
	public static void merge(int input[] , int si , int ei) {
		
		int mid = (si+ei)/2;
		int i=si;
		int j=mid+1;
		int k=0;
		int size = ei-si+1;
		int output[] = new int[size];
		while(i<=mid && j<=ei) {
			if(input[i]<input[j]) {
				output[k]=input[i];
				k++;
				i++;
			}else {
				output[k]=input[j];
				k++;
				j++;
			}
		}
		while(i<=mid) {
			output[k]=input[i];
			k++;
			i++;
		}
		while(j<=ei) {
			output[k]=input[j];
			k++;
			j++;
		}
		int m=0;
		for(int n=si; n<=ei; n++) {
			input[n]=output[m];
			m++;
		}
		
		
		
	}
	public static void mergeSort(int input[] , int si , int ei) {
		if(si>=ei) {
			return ;
		}
		int mid = (si+ei)/2;
		mergeSort(input , si , mid);
		mergeSort(input , mid+1 , ei);
		merge(input , si , ei);
	}

}
