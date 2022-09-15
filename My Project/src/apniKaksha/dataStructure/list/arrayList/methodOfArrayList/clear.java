package apniKaksha.dataStructure.list.arrayList.methodOfArrayList;

import java.util.LinkedList;
import java.util.List;

public class clear {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("hi");
		
		fruits.clear();
		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(fruits.contains("apple"));
		System.out.println(fruits.isEmpty());
		
	}

}
