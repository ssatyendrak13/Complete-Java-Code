package javatPoint.collectionFrameWork.list.arrayList.methods;

import java.util.ArrayList;

public class AddAndAddAllMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("sattu");
		list.add("sachin");
		list.add("nirala");
		list.add("amar");
		System.out.println(list);
		list.add(1,"sonu");
		System.out.println(list);
		
		ArrayList<String> list1 =   new ArrayList<String>();
		list1.add("soni");
		list.add("sandhya");
		
		list.addAll(list1);
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("good");
		list2.add("bad");
		list.addAll(1,list2);
		System.out.println(list);

	}

}
