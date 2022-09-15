package geeksForGeeks.string;

public class ReverseString {
	
	public static void main(String args[]) {
		
		String str = "name";
		System.out.println(reverseWord(str));;
		
	}
	 public static String reverseWord(String str)
	    {
	        // Reverse the string str
	        String ans = "";
	        for(int i=str.length()-1; i>=0; i--){
	            ans += str.charAt(i);
	        }
	        return ans;
	  }
	 

}
