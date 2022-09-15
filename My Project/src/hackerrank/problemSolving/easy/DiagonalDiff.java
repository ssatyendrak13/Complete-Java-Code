package hackerrank.problemSolving.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDiff {
	
	public static void main(String args[]) {
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements you want ");
		int n = sc.nextInt();
		int r =0; int c =0;
		for(int i=0; i<n*n; i++) {
			int elem = sc.nextInt();
			
		}
		
	}
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	    
		int n = arr.size()*arr.size();
		int r =0; int c =0;
		int sum1 = 0; int sum2 =0; 
		for(int i=0;i<n; i++) {
			if(r==c) sum1 += arr.get(r).get(c);
			if(r+c==n-1) sum2 += arr.get(r).get(c);
			c++;
			if(c==n) { 
				r++;
				c=0;
			}
		}
		return sum1+sum2;
	        
	}


}

