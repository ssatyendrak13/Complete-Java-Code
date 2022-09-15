package javatPoint.collectionFrameWork.list.arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class UsingListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("sattu");
		list.add("sachin");
		list.add("nirala");
		list.add("amar");
		
		ListIterator<String> list1=list.listIterator(list.size()); 
		while(list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}

	}

}
