package geeksForGeeks.array;

import java.util.Arrays;

public class MinimizeTheHeight {

	public static void main(String[] args) {
		int arr[] = {3, 9, 12, 16, 20};
		System.out.println(getMinDiff(arr , arr.length , 3));;

	}
	static int getMinDiff(int[] arr, int n, int k) {
        
		Arrays.sort(arr);
	       
	       int diff = arr[n-1] - arr[0];
	       
	       int maxNow = arr[n-1] - k;
	       int minNow = arr[0] + k;
	       int max = maxNow;
	       int min = minNow;
	       
	       for(int  i = 0; i < n - 1; i++){
	           max = Math.max(maxNow, arr[i] + k);
	           min = Math.min(minNow, arr[i+1] - k);
	           diff = (min < 0) ? diff : Math.min(diff, max - min);
	       }
	       return diff;
		
    }

}
