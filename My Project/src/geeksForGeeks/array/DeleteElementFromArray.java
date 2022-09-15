package geeksForGeeks.array;

public class DeleteElementFromArray {
	
	public static void main(String args[]) {
		
		int arr[] = {10,20,30,40,50,60};
		delete(arr , 30);
		
	}
	
	public static void delete(int input[] , int elem) {
		
		for(int i=0; i<input.length; i++) {
			
			if(elem == input[i]) {
				for(int j=i; j<input.length-1; j++) {
					
					input[j] = input[j+1];
					
				}
				break;
			}
			
		}
		for(int i=0; i<input.length-1; i++) {
			System.out.print(input[i]+" ");
		}
		
	}

}
