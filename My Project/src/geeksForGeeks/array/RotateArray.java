package geeksForGeeks.array;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		rotate(arr,arr.length);
	}
	 public static void rotate(int arr[], int n){
	        
		 int x =  arr[n-1] ;
		   for(int i=arr.length;i>0;i--) {
			   arr[i]=arr[i-1];
		   }
		   arr[0] = x ;
		 for(int item : arr) {
			 System.out.print(item+" ");
		 }
		 
	 }

}
