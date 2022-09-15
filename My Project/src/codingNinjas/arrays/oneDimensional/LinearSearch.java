package codingNinjas.arrays.oneDimensional;
import java.util.Scanner;;
public class LinearSearch {
	
	public static void main(String args[]) {
		
		System.out.println(linearSearch(new int[] {4,7,8,2,3,6,5},2));
			
	}
	public static int linearSearch(int input[] , int elem) {
		for(int i=0; i<input.length; i++) {
			if(input[i]==elem) {
				return i;
			}
		}
		return -1;
	}

}
