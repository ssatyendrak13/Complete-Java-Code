package apniKaksha.dataStructure.set;

import java.util.HashSet;
import java.util.Set;

public class SubArraySum1 {
	
	public static void main(String args[]) {
		
		int a[] =  {4,7,2,3,-5};
		boolean found = true;
		Set<Integer> set = new HashSet();
		int sum = 0;
		for(int element : a) {
			
			set.add(sum);
			sum += element;
			if(set.contains(sum)) {
				
				found= true;
				break;
				
			}
			
		}
		System.out.println(" found "+found);
		
	}

}
