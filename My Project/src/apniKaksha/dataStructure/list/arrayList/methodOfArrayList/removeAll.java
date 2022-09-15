package apniKaksha.dataStructure.list.arrayList.methodOfArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class removeAll {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("hi");
		
		List<String> toRemove = new ArrayList();
		
		toRemove.add("apple");
		toRemove.add("hi");
		
		fruits.removeAll(toRemove);
		System.out.println(fruits);

	}

}
