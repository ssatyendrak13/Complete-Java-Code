
package codingNinjas.arrays.oneDimensional;

import java.util.Scanner;

public class ArrayInput {
	
	public static void main(String args[]) {
		int arr[] = takeinput();
		print(arr);
		int largest = LargestInArray(arr);
		System.out.println(largest);
	}
	
	public static int LargestInArray(int input[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<input.length; i++) {
			if(input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}
	
	public static int[] takeinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an arrays");
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i=0; i<size; i++) {
			input[i] = sc.nextInt();
		}
		return input;
	}
	public static void print(int input[]) {
		int size = input.length;
		for(int i=0; i<size; i++) {
			System.out.print(input[i]+"  ");
		}
		System.out.println();
	}

}
