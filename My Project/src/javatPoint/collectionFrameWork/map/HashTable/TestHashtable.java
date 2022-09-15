package javatPoint.collectionFrameWork.map.HashTable;
import java.util.*;
public class TestHashtable {
	
	public static void main(String args[]) {
		
		Hashtable<Integer , String > map =  new Hashtable<>();
		 map.put(100,"Amit");    
	     map.put(102,"Ravi");   
	     map.put(101,"Vijay");    
	     map.put(103,"Rahul");    
	     System.out.println("before removing "+map);
	     map.remove(100);
	     System.out.println("after removed "+map);
	}

}
