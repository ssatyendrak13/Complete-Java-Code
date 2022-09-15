package javatPoint.collectionFrameWork.list.arrayList.UserDefinedClassObject;

import java.util.ArrayList;
import java.util.Iterator;

public class TestUserDefined {

	public static void main(String[] args) {
		
		Students s1 = new Students(101,"satyendra",18);
		Students s2 = new Students(102,"sachin",19);
		Students s3 = new Students(103,"nirala",20);
		
		ArrayList<Students> list = new ArrayList<Students>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			Students s = (Students)itr.next();
			System.out.println(s.roll+" is roll number "+s.name+" is name and "+s.age+" is age");
		}

	}

}
