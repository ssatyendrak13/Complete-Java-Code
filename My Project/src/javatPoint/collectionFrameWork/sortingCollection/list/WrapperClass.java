package javatPoint.collectionFrameWork.sortingCollection.list;
import java.util.*;
public class WrapperClass {
	
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		al.add(Integer.valueOf(101));
		al.add(Integer.valueOf(200));
		al.add(300);
		Collections.sort(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
