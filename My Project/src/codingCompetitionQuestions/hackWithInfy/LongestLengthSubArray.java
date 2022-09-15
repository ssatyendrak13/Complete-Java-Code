package codingCompetitionQuestions.hackWithInfy;

//you are given an array of size N . your task is to find the longest length subarray such that the gcd of the subarray is 
	// greater than or equal to the length of subarray 

public class LongestLengthSubArray {
	
	public static void main(String args[]) {
		
		
		int arr[] = {1,2,4,8};
		System.out.println(maxLengthSubArray(arr));
		
	}
	
	public static int maxLengthSubArray(int input[]) {
		
		int length = 1;
		
		for(int i=0; i<input.length; i++) {
			int result = input[i];
			int count = 1;
			for(int j=i+1; j<input.length; j++) {
				
				result = gcd(result , input[j]);
				count++;
				
				if(result >= count && length < count) {
					length = count;
				}else {
					break;
				}
			}
			
		}
		return length;
		
	}
	
	public static int gcd(int a , int b) {
		if( a == 0) {
			return b;
		}
		return gcd(b%a  , a);
	}

}
