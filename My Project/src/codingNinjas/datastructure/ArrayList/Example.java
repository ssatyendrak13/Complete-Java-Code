package codingNinjas.datastructure.ArrayList;
import java.util.ArrayList;
public class Example {
	
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(1,50);
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		list.remove(1);
		System.out.println();
		list.set(0, 100);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		for(int item : list) {
			System.out.print(item+" ");
		}
	}

}
