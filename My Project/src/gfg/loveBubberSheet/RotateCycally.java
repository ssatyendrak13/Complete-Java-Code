package gfg.loveBubberSheet;

public class RotateCycally {

	public static void main(String[] args) {
		
		int input[] = {1,2,3,4,5};
		int [] ans = rotate(input , 1);
		for(int item : ans ) {
			System.out.print(item+" ");
		}

	}
	 public static int[] rotate(int arr[], int count){
	        
		 	if(count==2) {
		 		for(int item : arr) {
		 			System.out.print(item+" ");
		 		}
		 	}else {
		 		int put = arr[arr.length-1];
		        for(int i=arr.length-1; i>0; i--){
		            arr[i]=arr[i-1];
		        }
		        arr[0]=put;
		        count++;
		 	}
		 	return rotate(arr , count);
//		 	return arr;
	        
	    }

}
