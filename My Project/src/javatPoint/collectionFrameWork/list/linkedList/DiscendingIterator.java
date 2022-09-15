package javatPoint.collectionFrameWork.list.linkedList;
import java.util.*;
public class DiscendingIterator {
	
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("sattu");
		list.add("sachin");
		list.add("nirala");
		list.add("amar");
		
		Iterator itr = list.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
