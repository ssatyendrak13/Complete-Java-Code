package javatPoint.collectionFrameWork.list.arrayList.methods;

import java.util.ArrayList;

public class RemoveRemoveAll {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sattu");
		list.add("sachin");
		list.add("nirala");
		list.add("amar");
//		list.remove("sattu");
//		System.out.println(list);
		
		ArrayList<String> list1 =   new ArrayList<String>();
		list1.add("sattu");
		list.add("amar");
		
		list.removeAll(list1);
		System.out.println(list);
		

	}

}
