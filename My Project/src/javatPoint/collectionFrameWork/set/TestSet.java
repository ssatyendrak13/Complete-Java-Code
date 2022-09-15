package javatPoint.collectionFrameWork.set;
import java.util.*;
public class TestSet {
	
	public static void main(String args[]) {
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(10);
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(13);
		
		System.out.println(s);
		
	}

}
