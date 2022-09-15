package javatPoint.collectionFrameWork.map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	
	
	public static void main(String args[]) {
		
		HashMap<Integer , String > m = new HashMap<>();
		m.put(1, "sattu");
		m.put(2, "nirala");
		m.put(3, "sachin");
		m.put(4, "amar");
		System.out.println("iterating hashmap element");
		for(Map.Entry item : m.entrySet()) {
			System.out.println(item.getKey()+"   "+item.getValue());
		}
		
	}

}
