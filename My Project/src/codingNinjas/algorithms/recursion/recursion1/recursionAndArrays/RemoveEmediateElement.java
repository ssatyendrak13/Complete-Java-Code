package codingNinjas.algorithms.recursion.recursion1.recursionAndArrays;

import java.util.ArrayList;

public class RemoveEmediateElement {
	
	public static void main(String args[]) {
		int [] input = {5,2,6,6,2,9,9,5};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int item : input) {
			list.add(item);
		}
		remove(list);
	}
	public static void remove(ArrayList<Integer> list  ) {
		for(int i=0 ; i<list.size()-1; i++) {
			if(list.size()==0) {
				System.out.println("NO BLOCK");
				return;
			}
		}
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i)==list.get(i+1)) {
				list.remove(i);
				list.remove(i);
			}
		}
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i)==list.get(i+1)) {
				remove(list);
			}
		}
		
		
	}

}
