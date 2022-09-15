package apniKaksha.dataStructure.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class methodcntd {

	public static void main(String[] args) {
		
		Map<String , Integer> numbers = new HashMap();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("five", 5);
//		
//		numbers.replace("one", 1, 10);
//		System.out.println(numbers);
//		numbers.remove("one");
//		System.out.println(numbers);
//		numbers.remove("two", 2);
//		System.out.println(numbers);

		System.out.println(numbers.keySet());
		
		Set<Entry<String , Integer>> entries = numbers.entrySet();			
		
		for(Entry<String , Integer> entry : entries) {
			
			entry.setValue(entry.getValue()*100);
			
		}
		System.out.println(numbers);
	}

}
