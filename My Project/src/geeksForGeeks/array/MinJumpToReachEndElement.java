package geeksForGeeks.array;

public class MinJumpToReachEndElement {

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJumps(arr));
	}
	 static int minJumps(int[] arr){
		 int reach=0;
		 int n=arr.length;
	        int curr_r=0;
	        int ans=0;
	        for(int i=0;i<n;i++){
	            if(i>reach){
	                return -1;
	            }
	            
	            reach=Math.max(reach,arr[i]+i);
	        
	            if(curr_r==i && i!=n-1){
	                ans++;
	                curr_r=reach;
	            }
	        }
	        return ans;
	 }

}
