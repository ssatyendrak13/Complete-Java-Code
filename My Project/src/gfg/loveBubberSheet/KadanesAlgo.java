package gfg.loveBubberSheet;

public class KadanesAlgo {
	
public static void main(String args[]) {
		
		System.out.println(maxSubarraySum(new int [] {-2,1,-3,4,-1,2,1,-5,4} , 9));
		
	}
	static long maxSubarraySum(int arr[], int n){
        
		int max = Integer.MIN_VALUE;
		int sum =0;
        for(int i=0; i<arr.length; i++) {
        	sum += arr[i];
        	if(max < sum) {
        		max = sum ;
        	}
        	if(sum<0) {
        		sum=0;
        	}
        }
        return max;
        
        
    }
	

}
