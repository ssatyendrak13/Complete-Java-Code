package apniKaksha.dataStructure.set.operationOnSet;

import java.util.HashSet;
import java.util.Set;

public class InterSection {
	
	public static void main(String args[]) {
		
		Set<Integer> x = new HashSet();
		x.add(23);
		x.add(1);
		x.add(6);
		
		Set<Integer> y = new HashSet();
		y.add(3);
		y.add(1);
		y.add(16);
		x.retainAll(y);
		System.out.println(x);
	}

}
