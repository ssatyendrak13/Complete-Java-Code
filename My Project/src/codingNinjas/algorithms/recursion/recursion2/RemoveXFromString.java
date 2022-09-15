package codingNinjas.algorithms.recursion.recursion2;

public class RemoveXFromString {

	public static void main(String[] args) {
		
		System.out.println(removeX("abxcxa"));
	}
	public static String removeX(String str ) {
		String output = "";
		if(str.length()==0) {
			return str;
		}
		if(str.charAt(0)!='x') {
			output = output + str.charAt(0);
		}
		String smallAns = removeX(str.substring(1));
		return output+smallAns;
	}

}
