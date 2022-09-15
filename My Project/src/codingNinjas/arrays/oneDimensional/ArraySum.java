package codingNinjas.arrays.oneDimensional;

import java.util.Scanner;

public class ArraySum {
	
	public static void main(String args[]) {
		int input[] = takeinput();
		sum(input);
	}
	
	public static int[] takeinput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];
		for(int i=0; i<n; i++) {
			input[i]=sc.nextInt();
		}
		return input;
	}
	public static void sum(int input[]) {
		int sum =0;
		for(int i=0; i<input.length; i++) {
			sum += input[i];
		}
		System.out.println(sum);
		
	}

}
