package javatPoint.collectionFrameWork.list.arrayList;

import java.util.ArrayList;

public class UsingForEach {
	
	public static void main(String args[]) {
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      //Printing the arraylist object   
	      for(String fruit : list) {
	    	  System.out.println(fruit);
	      }
	}

}
