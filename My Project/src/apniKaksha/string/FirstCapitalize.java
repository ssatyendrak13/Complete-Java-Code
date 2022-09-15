package apniKaksha.string;

import java.util.Scanner;

public class FirstCapitalize {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string of name");
		
		String name = sc.next();
		
		String name1 =  name.substring(0,1);
		String name2 = name1.toUpperCase();
		String name3 = name.substring(1);
		System.out.println(name2.concat(name3));

	}

}
