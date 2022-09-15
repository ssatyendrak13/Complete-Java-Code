package gfg.loveBubberSheet;

import java.util.Arrays;

public class CountInversion {
	
	public static void main(String args[]) {
		System.out.println(inversionCount(new long[] {10, 10, 10} , 3));
	}
	
	static long inversionCount(long arr[], long N)
	   {
	       // Your Code Here
	       return mergeSortCount(arr,0,N-1);
	   }
	   
	   public static long mergeCount(long[] arr, long l,
	                                    long m, long r)
	   {

	       long[] left = Arrays.copyOfRange(arr,(int) l, (int)(m + 1));
	       long[] right = Arrays.copyOfRange(arr,(int)(m + 1),(int)( r + 1));

	       long i = 0, j = 0, k = l, swaps = 0;

	       while (i < left.length && j < right.length) {
	           if (left[(int)i] <= right[(int)j])
	               arr[(int)k++] = left[(int)i++];
	           else {
	               arr[(int)k++] = right[(int)j++];
	               swaps += (m + 1) - (l + i);
	           }
	       }
	       while (i < left.length)
	           arr[(int)k++] = left[(int)i++];
	       while (j < right.length)
	           arr[(int)k++] = right[(int)j++];
	       return swaps;
	   }
	   private static long mergeSortCount(long[] arr, long l,
	                                        long r)
	   {
	       long count = 0;

	       if (l < r) {
	           long m = (l + r) / 2;
	           count += mergeSortCount(arr, l, m);
	           count += mergeSortCount(arr, m + 1, r);
	           count += mergeCount(arr, l, m, r);
	       }

	       return count;
	   }

}
