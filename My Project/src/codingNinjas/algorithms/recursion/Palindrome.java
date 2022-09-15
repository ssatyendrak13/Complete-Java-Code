package codingNinjas.algorithms.recursion;

public class Palindrome {
	
	public static void main(String args[]) {
		
		System.out.println(isPalindrome(235,0));
		
	}
	
	public static int isPalindrome(int n , int temp ) {
		if( n == 0 ) {
			return temp;
		}
		temp = temp * 10 + n%10;
		return isPalindrome(n/10 , temp);
	}
	
	
	// palindrome of string is 
	public static boolean isPalindrome(String s ) {
		
		if(s.length() == 0 || s.length() == 1 ) {
			return true;
		}
		if(s.charAt(0) == s.charAt(s.length()-1)) {
			return isPalindrome(s.substring(1 , s.length()-1));
		}
		return false;
		
		
	}

}
