package javatPoint.collectionFrameWork.map.entryInterface;
import java.util.*;
public class ComparingByKeyExample {
	
	public static void main(String[] args) {
		Map<Integer , String > map = new HashMap();
		map.put(1, "sattu");
		map.put(3, "nirala");
		map.put(2, "kk");
		map.put(4, "kumkum");
		// ascending order
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println();
		// descending order
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	}

}
