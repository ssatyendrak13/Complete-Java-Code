package javatPoint.array;

public class AnonymousArray {
	
	public static void main(String args[]) {
		
		print(new int[] {4,5,2,1,3,6,9});
	}
	
	public static void print(int input[]) {
		for(int i=0;i <input.length; i++) {
			System.out.print(input[i]+" ");
		}
	}
	
	public static int[] anonymous() {
		return new int[] {4,5,2,3,6};
	}

}
