package geeksForGeeks.array;

import java.util.Arrays;

public class SortTheArrays {
	
	public static void main(String args[]) {
		int arr[]= {0, 2, 1, 2, 0};
		sort012Method2(arr , arr.length);
	}
	
	 public static void sort012Method2(int a[], int n){
	        
		int NumberOfOnes =0;
		int NumberOfTwos =0;
		for(int i=0;i<n;i++) {
			if(a[i]==1) NumberOfOnes++;
			if(a[i]==2) NumberOfTwos++;
		}
		for(int i=0;i<n;i++) {
			if(i<(n-NumberOfOnes-NumberOfTwos)) a[i]=0;
			else if(i<(n-NumberOfTwos)) a[i]=1;
			else a[i]=2;
		}
		for(int item : a) {
			System.out.print(item+" ");
		}
		 
	 }
	
	 public static void sort012Method1(int a[], int n)
	    {
	        
		 for(int i=0;i<a.length;i++) {
			 
			 for(int j=0; j<a.length-1;j++) {
				 if(a[j] > a[j+1]) {
					 int temp = a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
			 }
		 }
		 for(int item : a) {
			 System.out.print(item+" ");
		 }
		 
	 }

}
