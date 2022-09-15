package javatPoint.collectionFrameWork.queue.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Example {
	
	public static void main(String args[]) {
		PriorityQueue<String> q=new PriorityQueue<String>();  
		q.add("Amit");  
		q.add("Vijay");  
		q.add("Karan");  
		q.add("Jai");  
		q.add("Rahul");  
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q);
		
		// iterating the element
		Iterator<String> itr = q.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		q.remove();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
	}

}
