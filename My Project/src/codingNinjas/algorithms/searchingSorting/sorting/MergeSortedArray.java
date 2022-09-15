package codingNinjas.algorithms.searchingSorting.sorting;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7};
		int ans[] = merge(arr1,arr2);
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]+" ");
		}
		
	}
	public static int[] merge(int arr1[] , int arr2[]) {
		int i=0; 
		int j=0; 
		int k=0;
		
		int ans[] = new int[arr1.length+arr2.length];
		while(i < arr1.length && j< arr2.length) {
			if(arr1[i] < arr2[j]) {
				ans[k]=arr1[i];
				k++;
				i++;
			}else {
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
		
		while( i < arr1.length) {
			ans[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			ans[k]=arr2[j];
			k++;
			j++;
		}
		return ans;
	}
}
