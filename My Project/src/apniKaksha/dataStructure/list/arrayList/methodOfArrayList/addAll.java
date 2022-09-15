package apniKaksha.dataStructure.list.arrayList.methodOfArrayList;

import java.util.LinkedList;
import java.util.List;

public class addAll {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList();
		
		List<String> vegetable = new LinkedList();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("hi");
		
		vegetable.add("potato");
		vegetable.add(" tomato ");
		vegetable.add("carrot");
		
		fruits.addAll(vegetable);
		System.out.println(fruits);
		

	}

}
