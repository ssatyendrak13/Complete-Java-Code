package javatPoint.collectionFrameWork.map.entryInterface;
import java.util.*;
public class ComparingByValueExample {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap();
		map.put(1, "satyendra");
		map.put(2, "kumkum");
		map.put(3, "amit");
		map.put(4, "yogesh");
		// ascending order
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);	
		System.out.println();
		// descending order
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}

}
