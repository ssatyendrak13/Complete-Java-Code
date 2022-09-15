package javatPoint.collectionFrameWork.map.entryInterface;

import java.util.*;

public class Example {
	
	public static void main(String[] args) {
		Map<Integer , String> map = new HashMap();
		map.put(1, "satyendra");
		map.put(2, "sachin");
		map.put(3, "amar");
		map.put(4, "nirala");
		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
