package apniKaksha.dataStructure.list.arrayList.methodOfArrayList;

import java.util.LinkedList;
import java.util.List;

public class set {

	public static void main(String[] args) {
		

		List<String> fruits = new LinkedList();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("hi");
		
		fruits.set(1, "banana");
		System.out.println(fruits);

	}

}
