package javatPoint.collectionFrameWork.sortingCollection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseSort {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		
		Collections.sort(al , Collections.reverseOrder());
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
