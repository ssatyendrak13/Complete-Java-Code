package javatPoint.collectionFrameWork.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListUsingIterator {
	
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
