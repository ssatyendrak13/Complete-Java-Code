package javatPoint.collectionFrameWork.map.entryInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example1 {
	
	public static void main(String[] args) {
		Map<Integer , String> map = new HashMap();
		map.put(1, "satyendra");
		map.put(2, "sachin");
		map.put(3, "amar");
		map.put(4, "nirala");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}

}
