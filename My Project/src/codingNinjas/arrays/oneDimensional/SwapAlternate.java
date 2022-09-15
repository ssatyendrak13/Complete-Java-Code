package codingNinjas.arrays.oneDimensional;

import java.util.Scanner;

public class SwapAlternate {
	
	public static void main(String args[]) {
		
		int arr[] = {4,7,8,5,6,2};
		AlternateSwap(arr);
		print(arr);
		
	}
	public static void AlternateSwap(int input[]) {
		for(int i=0; i<input.length-1; i++) {
			if(i%2==0) {
				int temp=input[i];
				input[i]=input[i+1];
				input[i+1]=temp;
			}
		}
	}
	public static void print(int input[]) {
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+"  ");
		}
	}
	
	
}
