package apniKaksha.dataStructure.queue.deque;

import java.util.ArrayDeque;

public class AsQueue {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(12);
		ad.addFirst(23);
		
		ad.pop();
		System.out.println(ad.peek());

	}

}
