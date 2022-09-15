package codingNinjas.algorithms.recursion.recursion2;

public class RemoveConsucutiveDuplicate {

	public static void main(String[] args) {
			
		System.out.println(removeDuplicate("xxyyzzzj"));

	}
	public static String removeDuplicate(String str) {
		
		if(str.length()<=1) {
			return str;
		}
		String ans = "";
		if(str.charAt(0)==str.charAt(1)) {
			return removeDuplicate(str.substring(1));
		}else {
			ans += str.charAt(0);
		}
		String small = removeDuplicate(str.substring(1));
		return ans + small;
		
	}

}
