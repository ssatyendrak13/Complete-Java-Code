package javatPoint.collectionFrameWork.genericClass;

import java.util.HashMap;
import java.util.Map;

public class UsingMap {

	public static void main(String[] args) {
		
		Map<Integer , String > map = new HashMap<>();
		
		map.put(1,"vijay");  
		map.put(4,"umesh");  
		map.put(2,"ankit");  
		
		for(Map.Entry item : map.entrySet()) {
			System.out.println(item);
		}

	}

}
