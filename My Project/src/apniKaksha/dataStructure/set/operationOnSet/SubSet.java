package apniKaksha.dataStructure.set.operationOnSet;

import java.util.HashSet;
import java.util.Set;

public class SubSet {
	
	public static void main(String args[]) {
		
		Set<Integer> x = new HashSet();
		x.add(23);
		x.add(1);
		x.add(6);
		
		Set<Integer> y = new HashSet();
		y.add(1);
//		y.containsAll(x);
		System.out.println(x.containsAll(y));
		
	}

}
