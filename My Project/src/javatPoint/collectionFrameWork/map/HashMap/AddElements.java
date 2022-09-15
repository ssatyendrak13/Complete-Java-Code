package javatPoint.collectionFrameWork.map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class AddElements {
	
	
	public static void main(String args[]) {
		
		
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		    System.out.println("Initial list of elements: "+hm);  
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");   
		      
		      for(Map.Entry item : hm.entrySet()) {
		    	  System.out.println(item.getKey()+"  "+item.getValue());
		      }
		      
		      hm.putIfAbsent(103, "saurav");
		      System.out.println("after invoking putIfAbsent() method");
		      for(Map.Entry item : hm.entrySet()) {
		    	  System.out.println(item.getKey()+"  "+item.getValue());
		      }
		      HashMap<Integer,String> map=new HashMap<Integer,String>();  
		      map.put(104,"Ravi");  
		      map.putAll(hm);  
		      System.out.println("after adding more map in first map");
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      
	}

}
