package codingNinjas.string;

public class CheckPalindrome {
	
	public static void main(String args[]) {
		String str = "nitins";
		System.out.println(palindrome(str));
	}
	
	public static boolean palindrome(String input) {
		
		int i=0; 
		int j=input.length()-1;
		while(i<j) {
			if(input.charAt(i)!=input.charAt(j)) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		return true;
		
		
	}

}
