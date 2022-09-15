package javatPoint.collectionFrameWork.map.HashMap;
import java.util.*;
public class DuplicateKey {

	public static void main(String[] args) {
		
		HashMap<Integer , String > map = new HashMap<>();

		   map.put(1,"Mango");   
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(1,"Grapes"); 
		   
		   System.out.println("iterating element of map");
		   
		   for(Map.Entry item : map.entrySet()) {
			   System.out.println(item.getKey()+"  "+item.getValue());
		   }
	}

}
