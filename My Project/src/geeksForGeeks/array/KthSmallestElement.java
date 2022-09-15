package geeksForGeeks.array;

import java.util.Arrays;

public class KthSmallestElement {
	
	public static void main(String args[]) {
		int arr[] = {7 ,10 ,4 ,3 ,20, 15};
		System.out.println(kthSmallest(arr , 0 , arr.length-1 , 3));
	}

	
	public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
		int ans = 0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length; i++) {
			ans = arr[k-1];
		}
        return ans; 
    } 

}
