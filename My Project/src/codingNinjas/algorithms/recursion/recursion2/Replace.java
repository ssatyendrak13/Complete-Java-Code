package codingNinjas.algorithms.recursion.recursion2;

public class Replace {

	public static void main(String[] args) {
		
		System.out.println(replace("abacd"));

	}
	public static String replace(String str) {
		if(str.length()==0) {
			return str;
		}
		String ans = "";
		if(str.charAt(0)=='a') {
			ans += 'x';
		}else {
			ans += str.charAt(0);
		}
		String smallAns = replace(str.substring(1));
		return ans + smallAns;
	}

}
