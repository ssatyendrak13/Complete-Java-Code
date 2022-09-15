package apniKaksha.dataStructure.set;

import java.util.*;

public class SHashSet {
	
	public static void main(String args[]) {
		
		Set<String> fruits = new HashSet();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		System.out.println(fruits);
		fruits.add("banana");
		System.out.println(fruits);
		System.out.println(fruits.add("banana"));
		System.out.println(fruits.add("orange"));
		
	}

}
