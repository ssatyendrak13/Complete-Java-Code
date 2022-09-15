package javatPoint.collectionFrameWork.list.vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListVsVector {
	
	
	public static void vector() {
		
		Vector<String> v=new Vector<String>();//creating vector  
		  v.add("umesh");//method of Collection  
		  v.addElement("irfan");//method of Vector  
		  v.addElement("kumar");  
		  //traversing elements using Enumeration  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		  }  
		
	}
	public static void arraylist() {
		
		List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Sonoo");//adding object in arraylist    
		  al.add("Michael");    
		  al.add("James");    
		  al.add("Andy");    
		  //traversing elements using Iterator  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }    
		
	}

}
