package apniKaksha.string;

public class AnagramString {

	public static void main(String[] args) {
		String a="laaben";
		String b="silent";
		boolean isAnagram = false;
		for(int i=0; i<a.length(); i++) {
			char c=a.charAt(i);
			isAnagram = false;
			for(int j=0; j<b.length(); j++) {
				if(b.charAt(j)==c) {
					isAnagram=true;
					break;
				}
			}
			if(!isAnagram) {
				break;
			}
		}
		if(isAnagram) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}

	}

}
