package javatPoint.string.String;

import java.util.StringJoiner;

public class Concatenation {

	public static void main(String[] args) {
		
		String s1 = "satyendra";
		String s2 = "kumar";
		String s3 = s1+s2;  // by concatenation operator 
		String s4 = s1.concat(s2);// by concat() method
		System.out.println(s3+"   "+s4);
		
		// concatenation by stringbuilder class
		StringBuilder sb1 = new StringBuilder("sachin");
		StringBuilder sb2 =   new StringBuilder("tendulkar");
		System.out.println(sb1.append(sb2));
		
		// concatenation of string by format() method
		String sf =   new String("satyendra");
		String sf1 = new String("kumar");
		String sf2 = String.format("%s%s",sf,sf1);
		System.out.println(sf2);
		
		// concatenation of string by string join method
		String sj = new String("hello");
		String sj1  = new String("world");
		String sj2 = String.join(" ",sj,sj1);
		System.out.println(sj2);
		
		//concatenation of string by stringjoiner class
		StringJoiner s = new StringJoiner(",");
		s.add("sattu");//first string
		s.add("satyendra");//second string
		System.out.println(s);

	}
	

}
