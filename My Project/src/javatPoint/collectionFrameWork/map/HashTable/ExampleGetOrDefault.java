package javatPoint.collectionFrameWork.map.HashTable;

import java.util.Hashtable;

public class ExampleGetOrDefault {

	public static void main(String[] args) {

		Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Amit");    
	     map.put(102,"Ravi");   
	     map.put(101,"Vijay");    
	     map.put(103,"Rahul");    
	     
	     System.out.println(map.getOrDefault(100, "not found"));
	     System.out.println(map.getOrDefault(105, "not found"));

	}

}
