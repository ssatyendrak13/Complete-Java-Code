package codingNinjas.arrays.oneDimensional;
import java.util.Scanner;
public class GCD {
	
	public static void main(String args[]) {
		
		int arr[] = {12,6,4};
		int result = gcdOfArray(arr);
		System.out.println(result);
		System.out.println(gcdRecur(4,6));
		
	}
	
	//find the gcd recursively 
	public static int gcdRecur(int a , int b) {
		int result = 0;
		if(a>b) {
			
			if(a%b == 0 ) {
				return b;
			}
			result = gcdRecur(a , a%b);
			
		}else {
			
			if(b%a == 0) {
				return a;
			}
			result = gcdRecur(b , b%a);
			
		}
		return result; 
	/*	
	 * second method to find out the gcd of an array is 
		if(a== 0 ) {
			return b;
		}
		return gcdRecur(b%a , a); */
		
	}
	// find the gcd of an array 
	public static int gcdOfArray(int input[]) {
		
		int result = input[0];
		for(int i=0; i<input.length; i++) {
			result = gcd(result , input[i]);
		}
		return result;
	}

	
	
	//find the gcd and lcm of two number 
	public static int gcd(int a , int b) {
		

		while(a%b  != 0) {
			int rem = a%b;
			a=b;
			b=rem;
		}
		int gcd = b;
		return gcd;
		
		
	}
	
	
}
