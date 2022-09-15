package javatPoint.array;

public class PassingArrayToMethod {
	
	public static void main(String args[]) {
		
		int arr[] = {7,4,5,8,6};
		get(arr);
		
	}
	public static void get(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
