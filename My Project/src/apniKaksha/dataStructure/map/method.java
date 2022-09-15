package apniKaksha.dataStructure.map;

import java.util.HashMap;
import java.util.Map;

public class method {
	
	public static void main(String args[]) {
		
		Map<String , Integer> numbers = new HashMap();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("five", 5);
		
		System.out.println(numbers);
		numbers.put("one", 10);
		System.out.println(numbers);
		numbers.putIfAbsent("three" , 3);
		System.out.println(numbers);
		System.out.println(numbers.get("five"));
		System.out.println(numbers.containsKey("three"));
		System.out.println(numbers.containsValue(3));
		
	}

}
