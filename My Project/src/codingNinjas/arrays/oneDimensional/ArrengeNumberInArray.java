package codingNinjas.arrays.oneDimensional;

public class ArrengeNumberInArray {

	public static void main(String[] args) {
		
		int [] input = arrengeNum(10);
		print(input);
		
	}
	public static int[] arrengeNum(int n) {
		
		int input[] = new int[n];
		int start = 0;
		int end = n-1;
		int k=1;
		for(int i=0; i<n; i++) {
			if(k%2!=0) {
				input[start++]=k++;
			}else {
				input[end--]=k++;
			}
		} 
		return input;
		
	}
	public static void print(int input[]) {
		for(int item : input) {
			System.out.print(item+" ");
		}
	}

}
