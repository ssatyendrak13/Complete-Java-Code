package codingNinjas.string;

public class AllSubString {

	public static void main(String[] args) {
		String str = "abc";
		allSubstring(str);
		allSubstring1(str);

	}
	// first approach
	public static void allSubstring(String str) {
		for(int i=0; i<str.length();i++) {
			for(int j=i+1; j<= str.length(); j++) {
				System.out.print(str.substring(i , j)+" ");
			}
		}
		System.out.println();
	}
	// second approach
	public static void allSubstring1(String str) {
		int r=0; 
		int c =1;
		for(int i=0; i<str.length()*str.length(); i++) {
			System.out.print(str.substring(r , c)+" ");
			c++;
			if(c==str.length()+1) {
				r++;
				c=r+1;
			}
			if(r==str.length()) {
				break;
			}
		}
	}

}
