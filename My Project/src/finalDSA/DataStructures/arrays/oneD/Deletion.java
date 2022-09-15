package finalDSA.DataStructures.arrays.oneD;

import java.util.Arrays;

public class Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] =  { 18, 30, 15, 70, 12 };
		int n= input.length;
		
		for(int i=0; i<n; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		
		n--;
		int pos = 3;
		int output[] = new int[n];
		for(int i=0; i <output.length; i++) {
			if(i<pos-1) {
				output[i]=input[i];
			}else {
				output[i]=input[i+1];
			}
		}
		System.out.print(Arrays.toString(output));

	}

}
