package javatPoint.collectionFrameWork.list.vector;

import java.util.Vector;

public class VectorTest1 {
	
	
	public static void main(String args[]) {
		
		Vector<String> v = new Vector();
		v.add("lion");
		v.add("tiger");
		v.add("dog");
		v.add("elephant");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		v.addElement("Rat");  
        v.addElement("Cat");  
        v.addElement("Deer");  
        
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v.contains("tiger"));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
	}

}
