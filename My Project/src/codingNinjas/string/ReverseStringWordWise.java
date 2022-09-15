package codingNinjas.string;

public class ReverseStringWordWise {

	public static void main(String[] args) {
		String str = "welcome to coding ninjas";
		System.out.println(reverseString1(str));

	}
	//first approach
	public static String reverseString1(String str) {
		int end = str.length();
		int i=str.length()-1; 
		String output = "";
		while(i>=0) {
			if(str.charAt(i)==' ') {
				output += str.substring(i+1, end) +" ";
				end=i;
			}
			i--;
		}
		output += str.substring(i+1, end);
		return output;
	}
	// second approach
	public static void reverseString(String str) {
		
		String[] ans = str.split(" ");
		for(int i=ans.length-1; i>=0; i--) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
