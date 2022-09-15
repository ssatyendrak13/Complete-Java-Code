package geeksForGeeks.array;

public class MoveNegativeNumToBegining {
	
	public static void main(String args[]) {
		
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		rearrenge(arr);
	}
	
	static void rearrenge(int input[]) {
		
		int j=0;
		for(int i=0;i<input.length;i++) {
			if(input[i] < 0) {
				if(i!=j) {
					int temp = input[i];
					input[i]=input[j];
					input[j]=temp;
				}
				j++;
			}
		}
		for(int item : input) {
			System.out.print(item+" ");
		}
		
	}
	
	

}
