package javatPoint.collectionFrameWork.list.linkedList;
import java.util.*;
public class TestLinkedList {
	
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList();
		list.add("sattu");
		list.add("sachin");
		list.add("nirala");
		list.add("amar");
		Iterator<String> name = list.iterator();
		while(name.hasNext()) {
			System.out.println(name.next());
		}
	}

}
