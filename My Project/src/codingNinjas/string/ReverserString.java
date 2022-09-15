package codingNinjas.string;

public class ReverserString {
	
	public static void main(String args[]) {
		reverseStrig("satyendra");
	}
	
	public static void reverseStrig(String str) {
		
		int i=str.length()-1;
		String output = "";
		while(i>=0) {
			output += str.charAt(i);
			i--;
		}
		System.out.println(output);
		
	}

}
