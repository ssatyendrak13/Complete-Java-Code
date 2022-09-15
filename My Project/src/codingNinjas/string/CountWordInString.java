package codingNinjas.string;

import java.util.Scanner;

public class CountWordInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("word count = "+count(str));
		
		
		
	}
	public static int count(String input) {
		
		int countWord = 0 ;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)==' ') {
				countWord++;
			}
		}
		return countWord+1;
		
	}

}
