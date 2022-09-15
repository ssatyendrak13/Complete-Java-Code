package javatPoint.collectionFrameWork.queue;

import java.util.*;

public class TestQueue {
	
	 public static void main(String[] args)
	    {
	        Queue<Integer> q= new LinkedList<>();
	        for (int i = 0; i < 5; i++)
	            q.add(i);
	        System.out.println("Elements of queue "+ q);
	        q.remove();
	        System.out.println(q);
	        q.add(5);
	        System.out.println(q);
	        System.out.println(q.peek());
	        q.add(0);
	        System.out.println(q);
	        System.out.println(q.peek());
	        m();
	    }
	 
	 public static void m() {
		 Stack<Integer> q= new Stack<>();
	        for (int i = 0; i < 5; i++)
	            q.add(i);
	       System.out.println(q.peek());
	 }


}
