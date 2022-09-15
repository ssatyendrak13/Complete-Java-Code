package javatPoint.collectionFrameWork.list.vector;

import java.util.Iterator;
import java.util.Vector;

public class TestVector {
	
	public static void main(String args[]) {
		
		Vector<String> v = new Vector();
		v.add("lion");
		v.add("tiger");
		v.add("dog");
		v.add("elephant");
		
		
		// add element using addElement() method
		
		v.addElement("rat");
		v.addElement("cat");
		v.addElement("deer");
		
		System.out.println(v);
		
	}

}
