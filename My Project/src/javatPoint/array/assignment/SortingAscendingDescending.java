package javatPoint.array.assignment;

public class SortingAscendingDescending {
	
	public static void main(String args[]) {
		sortDescending(new int [] {5, 2, 8, 7, 1});
	}
	public static void sortDescending(int input[]) {
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length-1;j++) {
				if(input[j+1] > input[j]) {
					int temp = input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
		for(int item : input) {
			System.out.print(item+" ");
		}
	}
	
	public static void sortAscending(int input[]) {
		for(int i=0;i<input.length; i++) {
			for(int j=0; j<input.length-1;j++) {
				if(input[j] > input[j+1]) {
					int temp = input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
		for(int item : input) {
			System.out.print(item+" ");
		}
		
	}

}
