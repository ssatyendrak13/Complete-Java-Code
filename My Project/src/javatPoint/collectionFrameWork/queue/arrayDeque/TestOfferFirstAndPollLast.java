package javatPoint.collectionFrameWork.queue.arrayDeque;
import java.util.*;
public class TestOfferFirstAndPollLast {
	
	public static void main(String args[]) {
		
		Deque<String> d = new ArrayDeque<>();
		d.add("sattu");
		d.offer("mukul");
		d.offer("jai");
		System.out.println(d);
		d.offerFirst("santosh");
		System.out.println(d);
		d.pollLast();
		System.out.println(d);
	}

}
