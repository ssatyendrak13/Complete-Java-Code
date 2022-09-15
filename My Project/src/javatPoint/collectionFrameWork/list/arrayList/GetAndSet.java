package javatPoint.collectionFrameWork.list.arrayList;

import java.util.ArrayList;

public class GetAndSet {

	public static void main(String[] args) {
		
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      System.out.println(list.get(1));
	      list.set(0, "Dates");
	      System.out.println(list);

	}

}
