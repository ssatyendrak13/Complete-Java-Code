package geeksForGeeks.array;

import java.util.Arrays;

public class MinNumOfOperatToDeleteAllElementOfArray {
	
	public static void main(String args[]) {
		
		
		int arr1[] = {2, 4, 6, 3, 5, 10} ;
		System.out.println(minOperation(arr1));
		
	}
	
	public static int minOperation(int input[]) {
		
		Arrays.sort(input);
		
		int res = 0;
		for(int i=0; i<input.length; i++) {
			
			int count =0;
			
			for(int j=i; j <input.length; j++) {
				
				if(input[j]%input[i] == 0 && input[j] != -1) {
					count++;
					input[j] = -1;
				}
				
			}
			if(count > 0) {
				res++;
			}
			
		}
		return res;
		
	}

}
