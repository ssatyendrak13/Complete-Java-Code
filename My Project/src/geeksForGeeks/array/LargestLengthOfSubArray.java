package geeksForGeeks.array;
import java.util.ArrayList;
import java.util.List;
/*There is an array with n elements. Find length of the largest subarray having GCD equal to 1. 
 * If no subarray with GCD 1, then print -1.*/

public class LargestLengthOfSubArray {
	
	public static void main(String args[]) {
		
		int arr[] = {2,4,6,8};
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(largestLength(list));
		
	}
	
	public static int largestLength(List<Integer> list ) {
		
		int result = 0;
		int count=0;
		for(int i=0; i<list.size(); i++) {
			
			result = gcd(result , list.get(i));
			if(result == 1 )
				count++;
			
		}
		return count;
	}

	private static int gcd(int a , int b) {
		
		if(a == 0) {
			return b;
		}
		return gcd(b%a , a);
		
	}

}
