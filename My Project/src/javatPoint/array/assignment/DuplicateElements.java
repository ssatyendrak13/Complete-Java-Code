package javatPoint.array.assignment;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {
	
	public static void main(String args[]) {
		System.out.println(duplicate(new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3}));
	}
	
	public static ArrayList<Integer> duplicate(int input[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int visited =-1;
		
		for(int i=0;i<input.length;i++) {
			int count=0;
			for(int j=i+1;j<input.length;j++) {
				if(input[i] == input[j] && input[j] != visited) {
					count++;
					input[j]=visited;
				}
			}
			if(count > 0) {
				list.add(input[i]);
			}
		}
		return list;
	}

}
