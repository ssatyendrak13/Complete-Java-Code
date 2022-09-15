package javatPoint.collectionFrameWork.set;
import java.util.*;
public class OperationOnSet {

	public static void main(String[] args) {
		
		Integer[] A = {22, 45,33, 66, 55, 34, 77};  
        Integer[] B = {33, 2, 83, 45, 3, 12, 55};  
        
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(A));
        Set<Integer> set2 =  new HashSet<>();
        set2.addAll(Arrays.asList(B));
        
        // finding intersection of set1 and set2
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection data of both set are "+intersection);
        
        // finding union of two sets
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union data of both sets are "+union);
        
        // finding difference between two sets
        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("element of set after difference "+diff);

	}

}
