package geeksForGeeks.array;

public class ContiguousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	long maxSubarraySum(int arr[], int n){
	        
		int sum=arr[0],res=arr[0];
	       for(int i=1;i<n;i++){
	           sum=Math.max(sum+arr[i],arr[i]);
	           res=Math.max(res,sum);

	       }
	       return res;
	        
	    }

}
