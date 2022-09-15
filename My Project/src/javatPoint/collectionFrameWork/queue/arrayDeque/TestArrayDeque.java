package javatPoint.collectionFrameWork.queue.arrayDeque;
import java.util.*;
public class TestArrayDeque {
	
	public static void main(String args[]) {
		Deque<String> d = new ArrayDeque();
		d.add("sattu");
		d.add("nirala");
		d.add("amar");
		
		Iterator<String> itr = d.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
