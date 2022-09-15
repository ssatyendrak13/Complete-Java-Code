package javatPoint.collectionFrameWork.sortingCollection.list;
import java.util.*;
public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		Collections.sort(al);
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
